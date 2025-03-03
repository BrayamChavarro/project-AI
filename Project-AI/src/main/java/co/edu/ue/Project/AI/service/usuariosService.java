package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.usuarios;
import co.edu.ue.Project.AI.repository.Iusuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class usuariosService implements IusuariosService{

    @Autowired
    Iusuarios dao;

    @Override
    public List<usuarios> agregarusuarios(usuarios usuarios) {
        
        return dao.addusuarios(usuarios);
    }

    @Override
    public usuarios actualizarusuarios(usuarios usuarios) {
       return dao.uppusuarios(usuarios);
    }

    @Override
    public List<usuarios> todasusuarios() {
        return  dao.getAllusuarios();
    }

    @Override
    public usuarios buscarIdusuarios(int usu_id) {
         return dao.getIdusuarios(usu_id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean bajausuarios(int usu_id) {
         return dao.deleteusuarios(usu_id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	
}