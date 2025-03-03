package co.edu.ue.Project.AI.repository;


import java.util.List;

import co.edu.ue.Project.AI.model.usuarios;

public interface Iusuarios {
	
	List<usuarios> addusuarios(usuarios usuarios);
	usuarios uppusuarios (usuarios usuarios);
	
	List<usuarios> getAllusuarios();
	usuarios getIdusuarios(int id);
	
	boolean deleteusuarios(int id);


}
