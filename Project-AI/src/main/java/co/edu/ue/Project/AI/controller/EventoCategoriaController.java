package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.EventoCategoria;
import co.edu.ue.Project.AI.service.IEventoCategoriaService;

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

public class EventoCategoriaController {
    
    @Autowired
    IEventoCategoriaService service;
    
    @GetMapping(value="eventocategoria")
    public List<EventoCategoria> getAllEventoCategoria() {
        return service.todasEventoCategoria();
    }
    
    @GetMapping(value="eventocategoria/{eventcat_id}")
    public EventoCategoria getEventosById(@PathVariable int eventcat_id) {
        return service.buscarIdEventoCategoria(eventcat_id);
    }

    @PostMapping(value="eventocategoria/add")
    public List<EventoCategoria> postEventoCategoria(@RequestBody EventoCategoria eventocategoria){
        return service.agregarEventoCategoria(eventocategoria);
    }
    
    @PutMapping(value="eventocategoria")
    public EventoCategoria putEventos(@RequestBody EventoCategoria eventocategoria) {
        return service.actualizarEventoCategoria(eventocategoria);
    }
    
    @DeleteMapping(value = "/eventocategoria/{event_id}")
    public ResponseEntity<String> deleteEventoCategoria(@PathVariable int eventcat_id) {
    boolean isDeleted = service.bajaEventoCategoria(eventcat_id);
    if (isDeleted) {
        return ResponseEntity.ok("Categoria de evento eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Categoria de Evento no encontrada.");
    }
}

}