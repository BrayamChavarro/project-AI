package co.edu.ue.Project.AI.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.Actualizaciones;

@Repository
public class ActualizacionesDao implements IActualizaciones {

    @Autowired
    IActualizacionesJpa jpa;
    private final Logger log = LoggerFactory.getLogger(ActualizacionesDao.class);

    @Override
    public List<Actualizaciones> addActualizaciones(Actualizaciones actualizaciones) {
        jpa.save(actualizaciones);
        return getAllActualizaciones();
    }

    @Override
    public Actualizaciones uppCategorias(Actualizaciones actualizaciones) {
        return jpa.save(actualizaciones);
    }

    @Override
    public List<Actualizaciones> getAllActualizaciones() {
        return jpa.findAll();
    }

    @Override
    public Actualizaciones getIdActualizaciones(int act_id) {
        return jpa.findById(act_id)
            .orElseThrow(() -> new RuntimeException("Actualizaciones no encontradas con id " + act_id));
    }

    @Override
    public boolean deleteActualizaciones(int act_id) {
        if (jpa.existsById(act_id)) {
            jpa.deleteById(act_id);
            return true;
        }
        return false;
    }
}