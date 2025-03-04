package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.Actualizaciones;
import co.edu.ue.Project.AI.repository.IActualizaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActualizacionesService implements IActualizacionesService {

    @Autowired
    IActualizaciones dao;

    @Override
    public List<Actualizaciones> agregarActualizaciones(Actualizaciones actualizaciones) {
        return dao.addActualizaciones(actualizaciones);
    }

    @Override
    public Actualizaciones actualizarCategorias(Actualizaciones actualizaciones) {
       return dao.uppCategorias(actualizaciones);
    }

    @Override
    public List<Actualizaciones> todasActualizaciones() {
        return dao.getAllActualizaciones();
    }

    @Override
    public Actualizaciones buscarIdActualizaciones(int act_id) {
         return dao.getIdActualizaciones(act_id);

    @Override
    public boolean bajaActualizaciones(int act_id) {
         return dao.deleteActualizaciones(act_id);
    }
}