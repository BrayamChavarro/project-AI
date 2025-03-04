package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.Actualizaciones;
import co.edu.ue.Project.AI.service.IActactualizacionesService;

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

public class ActualizacionesController {
    
    @Autowired
    IActualizacionesService service;
    
    @GetMapping(value="actualizaciones")
    public List<Actualizaciones> getAllActualizaciones() {
        return service.todasActualizaciones();
    }
    
    @GetMapping(value="actualizaciones/{cat_id}")
    public Actualizaciones getActualizacionesById(@PathVariable int act_id) {
        return service.buscarIdActualizaciones(act_id);
    }

    @PostMapping(value="actualizaciones/add")
    public List<Actualizaciones> postActualizaciones(@RequestBody Actualizaciones actualizaciones){
        return service.agregarActualizaciones(actualizaciones);
    }
    
    @PutMapping(value="actualizaciones")
    public Actualizaciones putUsuarios(@RequestBody Actualizaciones actualizaciones) {
        return service.actualizarActualizacion(actualizaciones);
    }
    
    @DeleteMapping(value = "/actualizaciones/{cat_id}")
    public ResponseEntity<String> deleteActualizaciones(@PathVariable int act_id) {
    boolean isDeleted = service.bajaActualizaciones(act_id);
    if (isDeleted) {
        return ResponseEntity.ok("actualizaciones eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("actualizaciones no encontrada.");
    }
}

}