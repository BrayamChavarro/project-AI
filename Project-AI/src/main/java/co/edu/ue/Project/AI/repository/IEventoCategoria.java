package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.EventoCategoria;

public interface IEventoCategoria{
    
    List<EventoCategoria> addEventoCategoria(EventoCategoria eventocategoria);
    EventoCategoria uppEventoCategoria (EventoCategoria eventocategoria);
    
    List<EventoCategoria> getAllEventoCategoria();
    EventoCategoria getIdEventoCategoria(int eventcat_id);
    
    boolean deleteEventoCategoria(int eventcat_id);
}