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

import com.smartopo.DAO.ProjetDAO;
import com.smartopo.entities.Projet;

@RestController
@RequestMapping(value = "/projets/")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjetController {
	@Autowired
	private ProjetDAO projetDAO;
	
	@GetMapping(value = "all")
	public List<Projet> getProjets(){
		return projetDAO.findAll();
	}
	
	@GetMapping(value = "all/{id}")
	public Optional<Projet> getProjet(@PathVariable Long id) {
		return projetDAO.findById(id);
	} 
	@DeleteMapping(value = "delete/{id}")
	public boolean deleteProjet(@PathVariable Long id) {
		projetDAO.deleteById(id);
		return true;
	}
	@PutMapping(value = "update")
	public Projet updateProjet(@RequestBody Projet projet) {
		return projetDAO.save(projet);
	}
	@PostMapping(value = "new")
	public Projet createProjet(@RequestBody Projet projet) {
		return projetDAO.save(projet);
	}
}
