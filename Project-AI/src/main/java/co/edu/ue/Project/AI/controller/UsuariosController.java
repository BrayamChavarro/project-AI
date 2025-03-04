package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.Usuarios;
import co.edu.ue.Project.AI.service.IUsuariosService;

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
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*", maxAge = 3600) 
@RestController 
@RequestMapping({"/project-AI"}) 

public class UsuariosController {
    
    @Autowired
    IUsuariosService service;
    
    @GetMapping(value="usuarios")
    public List<Usuarios> getAllUsuarios() {
        return service.todasUsuarios();
    }
    
    @GetMapping(value="usuarios/{usu_id}")
    public Usuarios getUsuariosById(@PathVariable int usu_id) {
        return service.buscarIdUsuarios(usu_id);
    }

    @PostMapping(value="usuarios/add")
    public List<Usuarios> postUsuarios(@RequestBody Usuarios usuarios){
        return service.agregarUsuarios(usuarios);
    }
    
    @PutMapping(value="usuarios")
    public Usuarios putUsuarios(@RequestBody Usuarios usuarios) {
        return service.actualizarUsuarios(usuarios);
    }
    
    @DeleteMapping(value = "/usuarios/{usu_id}")
    public ResponseEntity<String> deleteUsuarios(@PathVariable int usu_id) {
    boolean isDeleted = service.bajaUsuarios(usu_id);
    if (isDeleted) {
        return ResponseEntity.ok("Usuario eliminado correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado.");
    }
}

}