package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Subscripciones;


public interface ISubscripcionesService {
    
    List<Subscripciones> agregarSubscripciones(Subscripciones subscripciones);
    Subscripciones actualizaSubscripciones (Subscripciones subscripciones);
    
    List<Subscripciones> todasSubscripciones();
    Monitoreo buscarIdSubscripciones(int sub_id);
    
    boolean bajaSubscripciones(int sub_id);
}