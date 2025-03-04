package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.Fuentes;
import co.edu.ue.Project.AI.repository.IFuentes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuentesService implements IFuentesService {

    @Autowired
    IFuentes dao;

    @Override
    public List<Fuentes> agregarFuentes(Fuentes fuentes) {
        return dao.addFuentes(fuentes);
    }

    @Override
    public Fuentes actualizarFuentes(Fuentes fuentes) {
       return dao.uppFuentes(fuentes);
    }

    @Override
    public List<Fuentes> todasFuentes() {
        return dao.getAllFuentes();
    }

    @Override
    public Fuentes buscarIdFuentes(int fue_id) {
         return dao.getIdFuentes(fue_id);

    @Override
    public boolean bajaFuentes(int fue_id) {
         return dao.deleteFuentes(fue_id);
    }
}