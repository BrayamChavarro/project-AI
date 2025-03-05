package co.edu.ue.Project.AI.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.EventoCategoria;

@Repository
public class EventoCategoriaDao implements IEventoCategoria {

    @Autowired
    IEventoCategoriaJpa jpa;
    
    @Override
    public List<EventoCategoria> addEventoCategoria(EventoCategoria eventocategoria) {
        jpa.save(eventocategoria);
        return getAllEventoCategoria();
    }

    @Override
    public EventoCategoria uppEventoCategoria(EventoCategoria eventocategoria) {
        return jpa.save(eventocategoria);
    }

    @Override
    public List<EventoCategoria> getAllEventoCategoria() {
        return jpa.findAll();
    }

    @Override
    public EventoCategoria getIdEventoCategoria(int eventcat_id) {
        return jpa.findById(eventcat_id)
            .orElseThrow(() -> new RuntimeException("Evento no encontrado con id " + eventcat_id));
    }

    @Override
    public boolean deleteEventoCategoria(int eventcat_id) {
        if (jpa.existsById(eventcat_id)) {
            jpa.deleteById(eventcat_id);
            return true;
        }
        return false;
    }
}