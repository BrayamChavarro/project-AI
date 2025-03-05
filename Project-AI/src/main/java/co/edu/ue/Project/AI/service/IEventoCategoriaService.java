package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.EventoCategoria;


public interface IEventoCategoriaService {
    
    List<EventoCategoria> agregarEventoCategoria(EventoCategoria eventocategoria);
    EventoCategoria actualizarEventoCategoria (EventoCategoria eventocategoria);
    
    List<EventoCategoria> todasEventoCategoria();
    EventoCategoria buscarIdEventoCategoria(int eventcat_id);
    
    boolean bajaEventoCategoria(int eventcat_id);
}