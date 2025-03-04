package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.Monitoreo;
import co.edu.ue.Project.AI.service.IMonitoreoService;

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

public class MonitoreoController {
    
    @Autowired
    IMonitoreoService service;
    
    @GetMapping(value="monitoreo")
    public List<Monitoreo> getAllMonitoreo() {
        return service.todasMonitoreo();
    }
    
    @GetMapping(value="monitoreo/{mon_id}")
    public Monitoreo getMonitoreoById(@PathVariable int mon_id) {
        return service.buscarIdMonitoreo(mon_id);
    }

    @PostMapping(value="monitoreo/add")
    public List<Monitoreo> postMonitoreo(@RequestBody Eventos monitoreo){
        return service.agregarMonitoreo(monitoreo);
    }
    
    @PutMapping(value="monitoreo")
    public Monitoreo putMonitoreo(@RequestBody Eventos monitoreo) {
        return service.actualizarMonitoreo(monitoreo);
    }
    
    @DeleteMapping(value = "/monitoreo/{mon_id}")
    public ResponseEntity<String> deleteMonitoreo(@PathVariable int mon_id) {
    boolean isDeleted = service.bajaMonitoreo(mon_id);
    if (isDeleted) {
        return ResponseEntity.ok("monitoreo eliminado correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("monitoreo no encontrado.");
    }
}

}