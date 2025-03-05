package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.EventoCategoria;
import co.edu.ue.Project.AI.repository.IEventoCategoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoCategoriaService implements IEventoCategoriaService {

    @Autowired
    IEventoCategoria dao;

    @Override
    public List<EventoCategoria> agregarEventoCategoria(EventoCategoria eventocategoria) {
        return dao.addEventoCategoria(eventocategoria);
    }

    @Override
    public EventoCategoria actualizarEventoCategoria(EventoCategoria eventocategoria) {
       return dao.uppEventoCategoria(eventocategoria);
    }

    @Override
    public List<EventoCategoria> todasEventoCategoria() {
        return dao.getAllEventoCategoria();
    }

    @Override
    public EventoCategoria buscarIdEventoCategoria(int eventcat_id) {
         return dao.getIdEventoCategoria(eventcat_id);
    }
    @Override
    public boolean bajaEventoCategoria(int eventcat_id) {
         return dao.deleteEventoCategoria(eventcat_id);
    }
}