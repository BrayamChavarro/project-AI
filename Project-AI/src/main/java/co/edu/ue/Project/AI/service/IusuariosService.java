package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.usuarios;

public interface IusuariosService {
	
	List<usuarios> agregarusuarios(usuarios usuarios);
	usuarios actualizarusuarios (usuarios usuarios);
	
	List<usuarios> todasusuarios();
	usuarios buscarIdusuarios(int id);
	
	
	boolean bajausuarios(int id);


}
