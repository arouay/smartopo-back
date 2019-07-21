package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Projet;

public interface ProjetDAO extends JpaRepository<Projet, Long>{

}
