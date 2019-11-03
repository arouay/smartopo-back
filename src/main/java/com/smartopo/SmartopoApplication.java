package com.smartopo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smartopo.DAO.AdminDAO;
import com.smartopo.entities.Admin;

@SpringBootApplication
public class SmartopoApplication implements CommandLineRunner{	
	@Autowired
	private AdminDAO adminDAO;
	public static void main(String[] args) {
		//this.ad
		SpringApplication.run(SmartopoApplication.class, args);					
	}
	@Override
	public void run(String... args) throws Exception {
		adminDAO.save(new Admin("admin","admin"));
	}
}
