package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Notificaciones;

public interface INotificaciones{
    
    List<Notificaciones> addNotificaciones(Notificaciones notificaciones);
    Notificaciones uppNotificaciones (Notificaciones notificaciones);
    
    List<Notificaciones> getAllNotificaciones();
    Notificaciones getIdNotificaciones(int not_id);
    
    boolean deleteNotificaciones(int not_id);
}