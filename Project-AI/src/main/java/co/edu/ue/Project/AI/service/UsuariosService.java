package co.edu.ue.Project.AI.service;

import co.edu.ue.Project.AI.model.Usuarios;
import co.edu.ue.Project.AI.repository.IUsuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService implements IUsuariosService {

    @Autowired
    IUsuarios dao;

    @Override
    public List<Usuarios> agregarUsuarios(Usuarios usuarios) {
        return dao.addUsuarios(usuarios);
    }

    @Override
    public Usuarios actualizarUsuarios(Usuarios usuarios) {
       return dao.uppUsuarios(usuarios);
    }

    @Override
    public List<Usuarios> todasUsuarios() {
        return dao.getAllUsuarios();
    }

    @Override
    public Usuarios buscarIdUsuarios(int usu_id) {
         return dao.getIdUsuarios(usu_id);
    }

    @Override
    public boolean bajaUsuarios(int usu_id) {
         return dao.deleteUsuarios(usu_id);
    }
}