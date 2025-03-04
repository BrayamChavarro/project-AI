package co.edu.ue.Project.AI.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.Eventos;

@Repository
public class EventosDao implements IEventos {

    @Autowired
    IEventosJpa jpa;
    private final Logger log = LoggerFactory.getLogger(EventosDao.class);

    @Override
    public List<Eventos> addEventos(Eventos eventos) {
        jpa.save(eventos);
        return getAllEventos();
    }

    @Override
    public Eventos uppEventos(Eventos eventos) {
        return jpa.save(eventos);
    }

    @Override
    public List<Eventos> getAllEventos() {
        return jpa.findAll();
    }

    @Override
    public Eventos getIdEventos(int eve_id) {
        return jpa.findById(eve_id)
            .orElseThrow(() -> new RuntimeException("Evento no encontrado con id " + eve_id));
    }

    @Override
    public boolean deleteEventos(int eve_id) {
        if (jpa.existsById(eve_id)) {
            jpa.deleteById(eve_id);
            return true;
        }
        return false;
    }
}