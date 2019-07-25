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

import com.smartopo.DAO.SocieteDAO;
import com.smartopo.entities.Societe;

@RestController
@RequestMapping(value = "/societes/")

public class SocieteController {


		@Autowired
		private SocieteDAO societeDAO;
		
		@GetMapping(value = "all")
		public List<Societe> getSocietes(){
			return societeDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Societe> getSociete(@PathVariable Long id) {
			return societeDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteSociete(@PathVariable Long id) {
			societeDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Societe updateSociete(@RequestBody Societe societe) {
			return societeDAO.save(societe);
		}
		@PostMapping(value = "new")
		public Societe createSociete(@RequestBody Societe societe) {
			return societeDAO.save(societe);
		}
	}


