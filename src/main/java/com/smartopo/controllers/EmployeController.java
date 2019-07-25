package com.smartopo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartopo.DAO.EmployeDAO;

import com.smartopo.entities.Employe;

@RestController
@RequestMapping(value = "/employes/")

public class EmployeController {

	@Autowired
	private EmployeDAO employeDAO;
	
	@GetMapping(value = "all")
	public List<Employe> getEmployes(){
		return employeDAO.findAll();
	}
	
	@GetMapping(value = "all/{id}")
	public Optional<Employe> getEmploye(@PathVariable Long id) {
		return employeDAO.findById(id);
	} 
	@DeleteMapping(value = "delete/{id}")
	public boolean deleteEmploye(@PathVariable Long id) {
		employeDAO.deleteById(id);
		return true;
	}
	@PutMapping(value = "update")
	public Employe updateEmploye(@RequestBody Employe employe) {
		return employeDAO.save(employe);
	}
	@PostMapping(value = "new")
	public Employe createEmploye(@RequestBody Employe employe) {
		return employeDAO.save(employe);
	}

}
