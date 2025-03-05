package co.edu.ue.Project.AI.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.Subscripciones;

@Repository
public class SubscripcionesDao implements ISubscripciones {

    @Autowired
    ISubscripcionesJpa jpa;
    private final Logger log = LoggerFactory.getLogger(SubscripcionesDao.class);

    @Override
    public List<Subscripciones> addSubscripciones(Subscripciones subscripciones) {
        jpa.save(subscripciones);
        return getAllSubscripciones();
    }

    @Override
    public Subscripciones uppSubscripciones(Subscripciones subscripciones) {
        return jpa.save(subscripciones);
    }

    @Override
    public List<Subscripciones> getAllSubscripciones() {
        return jpa.findAll();
    }

    @Override
    public Subscripciones getIdSubscripciones(int sub_id) {
        return jpa.findById(sub_id)
            .orElseThrow(() -> new RuntimeException("Subscripcion no encontrado con id " + mon_id));
    }

    @Override
    public boolean deleteSubscripciones(int sub_id) {
        if (jpa.existsById(sub_id)) {
            jpa.deleteById(sub_id);
            return true;
        }
        return false;
    }
}