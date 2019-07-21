package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Particulier;

public interface ParticulerDAO extends JpaRepository<Particulier, Long>{

}
