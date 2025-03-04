package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Monitoreo;

public interface IMonitoreo{
    
    List<Monitoreo> addMonitoreo(Monitoreo monitoreo);
    Monitoreo uppMonitoreo (Monitoreo monitoreo);
    
    List<Monitoreo> getAllMonitoreo();
    Monitoreo getIdMonitoreo(int mon_id);
    
    boolean deleteMonitoreo(int mon_id);
}