package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Actualizaciones;

public interface IActualizaciones{
    
    List<Actualizaciones> addActualizaciones(Actualizaciones actualizaciones);
    Actualizaciones uppActualizaciones (Actualizaciones actualizaciones);
    
    List<Actualizaciones> getAllActualizaciones();
    Actualizaciones getIdActualizaciones(int act_id);
    
    boolean deleteActualizaciones(int act_id);
}