package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.Categorias;
import co.edu.ue.Project.AI.service.ICategoriasService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "*", maxAge = 3600) 
@RestController 
@RequestMapping({"/project-AI"}) 

public class CategoriasController {
    
    @Autowired
    ICategoriasService service;
    
    @GetMapping(value="categorias")
    public List<Categorias> getAllCategorias() {
        return service.todasCategorias();
    }
    
    @GetMapping(value="categorias/{cat_id}")
    public Categorias getCategoriasById(@PathVariable int cat_id) {
        return service.buscarIdCategorias(cat_id);
    }

    @PostMapping(value="categorias/add")
    public List<Categorias> postCategorias(@RequestBody Categorias categorias){
        return service.agregarCategorias(categorias);
    }
    
    @PutMapping(value="categorias")
    public Categorias putUsuarios(@RequestBody Categorias categorias) {
        return service.actualizarCategorias(categorias);
    }
    
    @DeleteMapping(value = "/categorias/{cat_id}")
    public ResponseEntity<String> deleteCategorias(@PathVariable int cat_id) {
    boolean isDeleted = service.bajaCategorias(cat_id);
    if (isDeleted) {
        return ResponseEntity.ok("categoria eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("categoria no encontrada.");
    }
}

}