package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Livrable;

public interface LivrableDAO extends JpaRepository<Livrable, Long>{

}
