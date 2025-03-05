package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.Subscripciones;
import co.edu.ue.Project.AI.repository.ISubscripciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscripcionesService implements ISubscripcionesService {

    @Autowired
    ISubscripciones dao;

    @Override
    public List<Subscripciones> agregarSubscripciones(Subscripciones subscripciones) {
        return dao.addSubscripciones(subscripciones);
    }

    @Override
    public Subscripciones actualizarSubscripciones(Subscripciones subscripciones) {
       return dao.uppSubscripciones(subscripciones);
    }

    @Override
    public List<Subscripciones> todasSubscripciones() {
        return dao.getAllSubscripciones();
    }

    @Override
    public Subscripciones buscarIdSubscripciones(int sub_id) {
         return dao.getIdSubscripciones(sub_id);

    @Override
    public boolean bajaSubscripciones(int sub_id) {
         return dao.deleteSubscripciones(sub_id);
    }
}