package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Particulier;

public interface ParticulierDAO extends JpaRepository<Particulier, Long>{

}