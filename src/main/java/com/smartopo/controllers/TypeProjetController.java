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

import com.smartopo.DAO.TypeProjetDAO;
import com.smartopo.entities.TypeProjet;

@RestController
@RequestMapping(value = "/typeprojets/")

public class TypeProjetController {


		@Autowired
		private TypeProjetDAO typeprojetDAO;
		
		@GetMapping(value = "all")
		public List<TypeProjet> gets(){
			return typeprojetDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<TypeProjet> getTypeProjet(@PathVariable Long id) {
			return typeprojetDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteTypeProjet(@PathVariable Long id) {
			typeprojetDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public TypeProjet updateTypeProjet(@RequestBody TypeProjet typeProjet) {
			return typeprojetDAO.save(typeProjet);
		}
		@PostMapping(value = "new")
		public TypeProjet createTypeProjet(@RequestBody TypeProjet typeProjet) {
			return typeprojetDAO.save(typeProjet);
		}
	}


