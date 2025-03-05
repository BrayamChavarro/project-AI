package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.Subscripciones;
import co.edu.ue.Project.AI.service.ISubscripcionesService;

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

public class SubscripcionesController {
    
    @Autowired
    ISubscripcionesService service;
    
    @GetMapping(value="subscripciones")
    public List<Subscripciones> getAllSubscripciones() {
        return service.todasSubscripciones();
    }
    
    @GetMapping(value="subscripciones/{sub_id}")
    public Subscripciones getSubscripcionesById(@PathVariable int sub_id) {
        return service.buscarIdSubscripciones(sub_id);
    }

    @PostMapping(value="subscripciones/add")
    public List<Subscripciones> postSubscripciones(@RequestBody Subscripciones subscripciones){
        return service.agregarSubscripciones(subscripciones);
    }
    
    @PutMapping(value="subscripciones")
    public Subscripciones putSubscripciones(@RequestBody Subscripciones subscripciones) {
        return service.actualizarSubscripciones(subscripciones);
    }
    
    @DeleteMapping(value = "/subscripciones/{sub_id}")
    public ResponseEntity<String> deleteSubscripciones(@PathVariable int sub_id) {
    boolean isDeleted = service.bajaSubscripciones(sub_id);
    if (isDeleted) {
        return ResponseEntity.ok("Subscripcion eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Subscripcion no encontrada.");
    }
}

}