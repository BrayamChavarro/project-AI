package co.edu.ue.Project.AI.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.Monitoreo;

@Repository
public class MonitoreoDao implements IMonitoreo {

    @Autowired
    IMonitoreoJpa jpa;
    private final Logger log = LoggerFactory.getLogger(MonitoreoDao.class);

    @Override
    public List<Monitoreo> addMonitoreo(Monitoreo monitoreo) {
        jpa.save(monitoreo);
        return getAllMonitoreo();
    }

    @Override
    public Monitoreo uppMonitoreo(Monitoreo monitoreo) {
        return jpa.save(monitoreo);
    }

    @Override
    public List<Monitoreo> getAllMonitoreo() {
        return jpa.findAll();
    }

    @Override
    public Monitoreo getIdMonitoreo(int mon_id) {
        return jpa.findById(mon_id)
            .orElseThrow(() -> new RuntimeException("Monitoreo no encontrado con id " + mon_id));
    }

    @Override
    public boolean deleteMonitoreo(int fue_id) {
        if (jpa.existsById(mon_id)) {
            jpa.deleteById(mon_id);
            return true;
        }
        return false;
    }
}