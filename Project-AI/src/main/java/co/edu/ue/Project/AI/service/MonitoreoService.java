package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.Monitoreo;
import co.edu.ue.Project.AI.repository.IMonitoreo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitoreoService implements IMonitoreoService {

    @Autowired
    IMonitoreo dao;

    @Override
    public List<Monitoreo> agregarMonitoreo(Monitoreo monitoreo) {
        return dao.addMonitoreo(monitoreo);
    }

    @Override
    public Monitoreo actualizarMonitoreo(Monitoreo monitoreo) {
       return dao.uppMonitoreo(monitoreo);
    }

    @Override
    public List<Monitoreo> todasMonitoreo() {
        return dao.getAllMonitoreo();
    }

    @Override
    public Monitoreo buscarIdMonitoreo(int mon_id) {
         return dao.getIdMonitoreo(mon_id);
    }
    @Override
    public boolean bajaMonitoreo(int mon_id) {
         return dao.deleteMonitoreo(mon_id);
    }
}