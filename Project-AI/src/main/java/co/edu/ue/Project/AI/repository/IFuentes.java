package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Fuentes;

public interface IFuentes{
    
    List<Fuentes> addFuentes(Fuentes fuentes);
    Fuentes uppFuentes (Fuentes fuentes);
    
    List<Fuentes> getAllFuentes();
    Fuentes getIdFuentes(int fue_id);
    
    boolean deleteFuentes(int fue_id);
}