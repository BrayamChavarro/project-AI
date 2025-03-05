package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Subscripciones;

public interface ISubscripciones{
    
    List<Subscripciones> addSubscripciones(Subscripciones subscripciones);
    Monitoreo uppSubscripciones (Subscripciones subscripciones);
    
    List<Subscripciones> getAllSubscripciones();
    Monitoreo getIdSubscripciones(int sub_id);
    
    boolean deleteSubscripciones(int sub_id);
}