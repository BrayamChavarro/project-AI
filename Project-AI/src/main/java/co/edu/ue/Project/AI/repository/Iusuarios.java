package co.edu.ue.Project.AI.repository;

import java.util.List;

import co.edu.ue.Project.AI.model.Usuarios;

public interface IUsuarios {
    
    List<Usuarios> addUsuarios(Usuarios usuarios);
    Usuarios uppUsuarios (Usuarios usuarios);
    
    List<Usuarios> getAllUsuarios();
    Usuarios getIdUsuarios(int usu_id);
    
    boolean deleteUsuarios(int usu_id);
}