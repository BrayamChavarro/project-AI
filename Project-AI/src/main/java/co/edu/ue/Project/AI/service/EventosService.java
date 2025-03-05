package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.Eventos;
import co.edu.ue.Project.AI.repository.IEventos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventosService implements IEventosService {

    @Autowired
    IEventos dao;

    @Override
    public List<Eventos> agregarEventos(Eventos eventos) {
        return dao.addEventos(eventos);
    }

    @Override
    public Eventos actualizarEventos(Eventos eventos) {
       return dao.uppEventos(eventos);
    }

    @Override
    public List<Eventos> todasEventos() {
        return dao.getAllEventos();
    }

    @Override
    public Eventos buscarIdEventos(int eve_id) {
         return dao.getIdEventos(eve_id);
    }
    @Override
    public boolean bajaEventos(int eve_id) {
         return dao.deleteEventos(eve_id);
    }
}