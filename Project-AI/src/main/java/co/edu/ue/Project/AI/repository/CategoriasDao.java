package co.edu.ue.Project.AI.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.Categorias;

@Repository
public class CategoriasDao implements ICategorias {

    @Autowired
    ICategoriasJpa jpa;
    

    @Override
    public List<Categorias> addCategorias(Categorias categorias) {
        jpa.save(categorias);
        return getAllCategorias();
    }

    @Override
    public Categorias uppCategorias(Categorias categorias) {
        return jpa.save(categorias);
    }

    @Override
    public List<Categorias> getAllCategorias() {
        return jpa.findAll();
    }

    @Override
    public Categorias getIdCategorias(int cat_id) {
        return jpa.findById(cat_id)
            .orElseThrow(() -> new RuntimeException("Categoria no encontrada con id " + cat_id));
    }

    @Override
    public boolean deleteCategorias(int cat_id) {
        if (jpa.existsById(cat_id)) {
            jpa.deleteById(cat_id);
            return true;
        }
        return false;
    }
}