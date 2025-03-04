package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Categorias;


public interface ICategoriasService {
    
    List<Categorias> agregarCategorias(Categorias categorias);
    Categorias actualizarCategorias (Categorias categorias);
    
    List<Categorias> todasCategorias();
    Categorias buscarIdCategorias(int cat_id);
    
    boolean bajaCategorias(int cat_id);
}