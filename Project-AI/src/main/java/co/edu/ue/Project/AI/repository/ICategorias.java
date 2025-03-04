package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Categorias;

public interface ICategorias {
    
    List<Categorias> addCategorias(Categorias categorias);
    Categorias uppCategorias (Categorias categorias);
    
    List<Categorias> getAllCategorias();
    Categorias getIdCategorias(int cat_id);
    
    boolean deleteCategorias(int cat_id);
}