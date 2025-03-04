package co.edu.ue.Project.AI.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.Fuentes;

@Repository
public class FuentesDao implements IFuentes {

    @Autowired
    IFuentesJpa jpa;
    private final Logger log = LoggerFactory.getLogger(FuentesDao.class);

    @Override
    public List<Fuentes> addFuentes(Fuentes fuentes) {
        jpa.save(fuentes);
        return getAllFuentes();
    }

    @Override
    public Fuentes uppFuentes(Fuentes fuentes) {
        return jpa.save(fuentes);
    }

    @Override
    public List<Fuentes> getAllFuentes() {
        return jpa.findAll();
    }

    @Override
    public Fuentes getIdFuentes(int fue_id) {
        return jpa.findById(fue_id)
            .orElseThrow(() -> new RuntimeException("Fuente no encontrado con id " + fue_id));
    }

    @Override
    public boolean deleteFuentes(int fue_id) {
        if (jpa.existsById(fue_id)) {
            jpa.deleteById(fue_id);
            return true;
        }
        return false;
    }
}