package co.edu.ue.Project.AI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.Project.AI.model.Eventos;


public interface IEventosJpa extends JpaRepository<Eventos, Integer> {

}