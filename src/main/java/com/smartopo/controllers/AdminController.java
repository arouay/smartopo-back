package com.smartopo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartopo.DAO.AdminDAO;
import com.smartopo.entities.Admin;

@RestController
@RequestMapping(value = "/admins/")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	@Autowired
	private AdminDAO adminDAO;

	@GetMapping(value = "all")
	public List<Admin> getAdmins(){
		return adminDAO.findAll();
	}
	
	@GetMapping(value = "all/{id}")
	public Optional<Admin> getAdmin(@PathVariable Long id) {
		return adminDAO.findById(id);
	} 
	@DeleteMapping(value = "delete/{id}")
	public boolean deleteAdmin(@PathVariable Long id) {
		adminDAO.deleteById(id);
		return true;
	}
	@PutMapping(value = "update")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminDAO.save(admin);
	}
	@PostMapping(value = "new")
	public Admin createAdmin(@RequestBody Admin admin) {
		return adminDAO.save(admin);
	}
}
