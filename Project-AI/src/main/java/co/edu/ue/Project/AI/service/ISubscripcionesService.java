package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Subscripciones;


public interface ISubscripcionesService {
    
    List<Subscripciones> agregarSubscripciones(Subscripciones subscripciones);
    Subscripciones actualizarSubscripciones (Subscripciones subscripciones);
    
    List<Subscripciones> todasSubscripciones();
    Subscripciones buscarIdSubscripciones(int sub_id);
    
    boolean bajaSubscripciones(int sub_id);
}