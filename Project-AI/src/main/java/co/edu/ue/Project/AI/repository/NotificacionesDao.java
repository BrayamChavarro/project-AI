package co.edu.ue.Project.AI.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.Notificaciones;

@Repository
public class NotificacionesDao implements INotificaciones {

    @Autowired
    INotificacionesJpa jpa;
   
    @Override
    public List<Notificaciones> addNotificaciones(Notificaciones notificaciones) {
        jpa.save(notificaciones);
        return getAllNotificaciones();
    }

    @Override
    public Notificaciones uppNotificaciones(Notificaciones notificaciones) {
        return jpa.save(notificaciones);
    }

    @Override
    public List<Notificaciones> getAllNotificaciones() {
        return jpa.findAll();
    }

    @Override
    public Notificaciones getIdNotificaciones(int not_id) {
        return jpa.findById(not_id)
            .orElseThrow(() -> new RuntimeException("Notificacion no encontrado con id " + not_id));
    }

    @Override
    public boolean deleteNotificaciones(int not_id) {
        if (jpa.existsById(not_id)) {
            jpa.deleteById(not_id);
            return true;
        }
        return false;
    }
}