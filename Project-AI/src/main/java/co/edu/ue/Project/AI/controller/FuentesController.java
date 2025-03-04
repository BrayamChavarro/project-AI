package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.Fuentes;
import co.edu.ue.Project.AI.service.IFuentesService;

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

public class FuentesController {
    
    @Autowired
    IFuentesService service;
    
    @GetMapping(value="eventos")
    public List<Fuentes> getAllFuentes() {
        return service.todasFuentes();
    }
    
    @GetMapping(value="eventos/{fue_id}")
    public Fuentes getFuentesById(@PathVariable int fue_id) {
        return service.buscarIdFuentes(fue_id);
    }

    @PostMapping(value="fuentes/add")
    public List<Fuentes> postFuentes(@RequestBody Fuentes fuentes){
        return service.agregarFuentes(eventos);
    }
    
    @PutMapping(value="fuentes")
    public Fuentes putFuentes(@RequestBody Fuentes fuentes) {
        return service.actualizarFuentes(fuentes);
    }
    
    @DeleteMapping(value = "/fuentes/{act_id}")
    public ResponseEntity<String> deleteFuentes(@PathVariable int fue_id) {
    boolean isDeleted = service.bajaFuentes(fue_id);
    if (isDeleted) {
        return ResponseEntity.ok("fuente eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("fuente no encontrada.");
    }
}

}