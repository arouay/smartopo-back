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

import com.smartopo.DAO.RecetteDAO;
import com.smartopo.entities.Recette;

@RestController
@RequestMapping(value = "/recettes/")

public class RecetteController {


		@Autowired
		private RecetteDAO recetteDAO;
		
		@GetMapping(value = "all")
		public List<Recette> getRecettes(){
			return recetteDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Recette> getRecette(@PathVariable Long id) {
			return recetteDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteRecette(@PathVariable Long id) {
			recetteDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Recette updateRecette(@RequestBody Recette recette) {
			return recetteDAO.save(recette);
		}
		@PostMapping(value = "new")
		public Recette createRecette(@RequestBody Recette recette) {
			return recetteDAO.save(recette);
		}
	}


