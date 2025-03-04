package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Actualizaciones;


public interface IActualizacionesService {
    
    List<Actualizaciones> agregarActualizaciones(Actualizaciones actualizaciones);
    Actualizaciones actualizarActualizaciones (Actualizaciones actualizaciones);
    
    List<Actualizaciones> todasActualizaciones();
    Actualizaciones buscarIdActualizaciones(int act_id);
    
    boolean bajaActualizaciones(int act_id);
}