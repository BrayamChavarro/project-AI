package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Monitoreo;


public interface IMonitoreoService {
    
    List<Monitoreo> agregarMonitoreo(Monitoreo monitoreo);
    Monitoreo actualizarMonitoreo (Monitoreo monitoreo);
    
    List<Monitoreo> todasMonitoreo();
    Monitoreo buscarIdMonitoreo(int mon_id);
    
    boolean bajaMonitoreo(int mon_id);
}