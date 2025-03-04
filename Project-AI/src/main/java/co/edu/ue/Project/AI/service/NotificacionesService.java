package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.Notificaciones;
import co.edu.ue.Project.AI.repository.INotificaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacionesService implements INotificacionesService {

    @Autowired
    INotificaciones dao;

    @Override
    public List<Notificaciones> agregarNotificaciones(Notificaciones notificaciones) {
        return dao.addNotificaciones(notificaciones);
    }

    @Override
    public Notificaciones actualizarNotificaciones(Notificaciones notificaciones) {
       return dao.uppNotificaciones(notificaciones);
    }

    @Override
    public List<Notificaciones> todasNotificaciones() {
        return dao.getAllNotificaciones();
    }

    @Override
    public Notificaciones buscarIdNotificaciones(int not_id) {
         return dao.getIdNotificaciones(not_id);

    @Override
    public boolean bajaNotificaciones(int not_id) {
         return dao.deleteNotificaciones(not_id);
    }
}