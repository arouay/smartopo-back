package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Recette;

public interface RecetteDAO extends JpaRepository<Recette, Long>{

}
