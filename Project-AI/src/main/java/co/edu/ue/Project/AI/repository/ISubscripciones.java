package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Subscripciones;

public interface ISubscripciones{
    
    List<Subscripciones> addSubscripciones(Subscripciones subscripciones);
    Subscripciones uppSubscripciones (Subscripciones subscripciones);
    
    List<Subscripciones> getAllSubscripciones();
    Subscripciones getIdSubscripciones(int sub_id);
    
    boolean deleteSubscripciones(int sub_id);
}