package co.edu.ue.Project.AI.repository;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.ue.Project.AI.model.usuarios;

@Repository
public class usuariosDao implements Iusuarios {

	//inyeccion de dependencias por interface
	@Autowired
	IusuariosJpa jpa;
	private final Logger log = LoggerFactory.getLogger(usuariosDao.class);

	
        @Override
	public List<usuarios> addusuarios(usuarios usuarios) {
		jpa.save(usuarios);
		return getAllusuarios();
		
	}

	@Override
	public usuarios uppusuarios(usuarios usuarios) {
		return jpa.save(usuarios);
	}

	@Override
	public List<usuarios> getAllusuarios() {
		return jpa.findAll();
	}

	@Override
	public usuarios getIdusuarios(int usu_id) {
    return jpa.findById(usu_id)
            .orElseThrow(() -> new RuntimeException("usuario no encontrado con id " + usu_id));
}

	@Override
	public boolean deleteusuarios(int usu_id) {
    if (jpa.existsById(usu_id)) {
        jpa.deleteById(usu_id);
        return true;
    }
    return false;
}


}