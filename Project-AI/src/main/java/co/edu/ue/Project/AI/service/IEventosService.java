package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Eventos;


public interface IEventosService {
    
    List<Eventos> agregarEventos(Eventos eventos);
    Eventos actualizarEventos (Eventos eventos);
    
    List<Eventos> todasEventos();
    Eventos buscarIdEventos(int eve_id);
    
    boolean bajaEventos(int eve_id);
}