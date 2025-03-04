package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Notificaciones;


public interface INotificacionesService {
    
    List<Notificaciones> agregarNotificaciones(Notificaciones notificaciones);
    Notificaciones actualizarNotificaciones (Notificaciones notificaciones);
    
    List<Notificaciones> todasNotificaciones();
    Notificaciones buscarIdNotificaciones(int not_id);
    
    boolean bajaNotificaciones(int not_id);
}