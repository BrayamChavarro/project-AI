package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.Categorias;
import co.edu.ue.Project.AI.repository.ICategorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriasService implements ICategoriasService {

    @Autowired
    ICategorias dao;

    @Override
    public List<Categorias> agregarCategorias(Categorias categorias) {
        return dao.addCategorias(categorias);
    }

    @Override
    public Categorias actualizarCategorias(Categorias categorias) {
       return dao.uppCategorias(categorias);
    }

    @Override
    public List<Categorias> todasCategorias() {
        return dao.getAllCategorias();
    }

    @Override
    public Categorias buscarIdCategorias(int cat_id) {
         return dao.getIdCategorias(cat_id);
    }

    @Override
    public boolean bajaCategorias(int cat_id) {
         return dao.deleteCategorias(cat_id);
    }
}