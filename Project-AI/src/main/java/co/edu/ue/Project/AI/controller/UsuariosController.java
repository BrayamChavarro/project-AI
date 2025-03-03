package co.edu.ue.Project.AI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Project.AI.model.usuarios;
import co.edu.ue.Project.AI.service.IusuariosService;

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
    


	//validaciones de campos expresiones regulares - clase validator
	
	@Autowired
	IusuariosService service;
	
	@GetMapping(value="usuarios")
	public List<usuarios> getAllusuarios() {
		return service.todasusuarios();
	}
	
	@GetMapping(value="usuarios/{usu_id}")
	public usuarios gettareasById(@PathVariable int usu_id) {
		return service.buscarIdusuarios(usu_id);
	}

	@PostMapping(value="usuarios/add")
	public List<usuarios> postusuarios(@RequestBody usuarios usuarios){
		return service.agregarusuarios(usuarios);
	}
	
	@PutMapping(value="usuarios")
	public usuarios putusuarios(@RequestBody usuarios usuarios) {
		return service.actualizarusuarios(usuarios);
	}
	
	@DeleteMapping(value = "/usuarios/{usu_id}")
	public ResponseEntity<String> deleteusuarios(@PathVariable int usu_id) {
    boolean isDeleted = service.bajausuarios(usu_id);
    if (isDeleted) {
        return ResponseEntity.ok("Usuario eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrada.");
    }
}


    

                        
}