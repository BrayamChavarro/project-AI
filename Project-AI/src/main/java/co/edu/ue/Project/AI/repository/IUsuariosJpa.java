package co.edu.ue.Project.AI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.Project.AI.model.Usuarios;

public interface IUsuariosJpa extends JpaRepository<Usuarios, Integer> {

}