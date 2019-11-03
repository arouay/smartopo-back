package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Admin;

public interface AdminDAO extends JpaRepository<Admin, Long>{

}
