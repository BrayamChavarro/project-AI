package co.edu.ue.Project.AI.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.Usuarios;

@Repository
public class UsuariosDao implements IUsuarios {

    @Autowired
    IUsuariosJpa jpa;

    @Override
    public List<Usuarios> addUsuarios(Usuarios usuarios) {
        jpa.save(usuarios);
        return getAllUsuarios();
    }

    @Override
    public Usuarios uppUsuarios(Usuarios usuarios) {
        return jpa.save(usuarios);
    }

    @Override
    public List<Usuarios> getAllUsuarios() {
        return jpa.findAll();
    }

    @Override
    public Usuarios getIdUsuarios(int usu_id) {
        return jpa.findById(usu_id)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id " + usu_id));
    }

    @Override
    public boolean deleteUsuarios(int usu_id) {
        if (jpa.existsById(usu_id)) {
            jpa.deleteById(usu_id);
            return true;
        }
        return false;
    }
}