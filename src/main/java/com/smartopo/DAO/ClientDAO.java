package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Client;

public interface ClientDAO extends JpaRepository<Client, Long>{

}
