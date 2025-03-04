package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Eventos;

public interface IEventos{
    
    List<Eventos> addEventos(Eventos eventos);
    Eventos uppEventos (Eventos eventos);
    
    List<Eventos> getAllEventos();
    Eventos getIdEventos(int eve_id);
    
    boolean deleteEventos(int eve_id);
}