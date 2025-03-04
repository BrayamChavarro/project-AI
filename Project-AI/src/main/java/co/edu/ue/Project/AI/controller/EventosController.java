package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.Eventos;
import co.edu.ue.Project.AI.service.IEventosService;

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

public class EventosController {
    
    @Autowired
    IEventosService service;
    
    @GetMapping(value="eventos")
    public List<Eventos> getAllEventos() {
        return service.todasEventos();
    }
    
    @GetMapping(value="eventos/{eve_id}")
    public Eventos getEventosById(@PathVariable int eve_id) {
        return service.buscarIdEventos(eve_id);
    }

    @PostMapping(value="eventos/add")
    public List<Eventos> postEventos(@RequestBody Eventos eventos){
        return service.agregarEventos(eventos);
    }
    
    @PutMapping(value="eventos")
    public Eventos putEventos(@RequestBody Eventos eventos) {
        return service.actualizarEventos(eventos);
    }
    
    @DeleteMapping(value = "/eventos/{eve_id}")
    public ResponseEntity<String> deleteEventos(@PathVariable int eve_id) {
    boolean isDeleted = service.bajaEventos(eve_id);
    if (isDeleted) {
        return ResponseEntity.ok("Evento eliminado correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento no encontrado.");
    }
}

}