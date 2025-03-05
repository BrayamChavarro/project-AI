package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.Notificaciones;
import co.edu.ue.Project.AI.service.INotificacionesService;

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

public class NotificacionesController {
    
    @Autowired
    INotificacionesService service;
    
    @GetMapping(value="notificaciones")
    public List<Notificaciones> getAllNotificaciones() {
        return service.todasNotificaciones();
    }
    
    @GetMapping(value="notificaciones/{not_id}")
    public Notificaciones getNotificacionesById(@PathVariable int not_id) {
        return service.buscarIdNotificaciones(not_id);
    }

    @PostMapping(value="notificaciones/add")
    public List<Notificaciones> postNotificaciones(@RequestBody Notificaciones notificaciones){
        return service.agregarNotificaciones(notificaciones);
    }
    
    @PutMapping(value="notificaciones")
    public Notificaciones putNotificaciones(@RequestBody Notificaciones notificaciones) {
        return service.actualizarNotificaciones(notificaciones);
    }
    
    @DeleteMapping(value = "/notificaciones/{not_id}")
    public ResponseEntity<String> deleteNotificaciones(@PathVariable int not_id) {
    boolean isDeleted = service.bajaNotificaciones(not_id);
    if (isDeleted) {
        return ResponseEntity.ok("notificacion eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("notificacion no encontrada.");
    }
}

}