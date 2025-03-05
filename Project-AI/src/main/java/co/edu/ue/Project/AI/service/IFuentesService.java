package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Fuentes;


public interface IFuentesService {
    
    List<Fuentes> agregarFuentes(Fuentes fuentes);
    Fuentes actualizarFuentes (Fuentes fuentes);
    
    List<Fuentes> todasFuentes();
    Fuentes buscarIdFuentes(int fue_id);
    
    boolean bajaFuentes(int fue_id);
}