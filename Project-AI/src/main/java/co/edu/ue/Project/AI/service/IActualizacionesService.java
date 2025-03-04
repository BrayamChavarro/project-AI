package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Actualizaciones;


public interface IActualizacionesService {
    
    List<Actualizaciones> agregarActualizaciones(Actualizaciones actualizaciones);
    Actualizaciones actualizarActualizaciones (Actualizaciones actualizaciones);
    
    List<Actualizaciones> todasActualizaciones();
    Actualizaciones buscarIdActualizaciones(int cat_id);
    
    boolean bajaActualizaciones(int cat_id);
}