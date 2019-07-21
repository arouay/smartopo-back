package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Tache;

public interface TacheDAO extends JpaRepository<Tache, Long>{

}
