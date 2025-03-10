package co.edu.ue.Project.AI.service;

import java.util.List;

import co.edu.ue.Project.AI.model.Usuarios;

public interface IUsuariosService {
    
    List<Usuarios> agregarUsuarios(Usuarios usuarios);
    Usuarios actualizarUsuarios (Usuarios usuarios);
    
    List<Usuarios> todasUsuarios();
    Usuarios buscarIdUsuarios(int usu_id);
    
    boolean bajaUsuarios(int usu_id);
}