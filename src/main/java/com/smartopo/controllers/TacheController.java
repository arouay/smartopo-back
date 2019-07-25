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

import com.smartopo.DAO.TacheDAO;
import com.smartopo.entities.Tache;

@RestController
@RequestMapping(value = "/taches/")

public class TacheController {


		@Autowired
		private TacheDAO tacheDAO;
		
		@GetMapping(value = "all")
		public List<Tache> getTache(){
			return tacheDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Tache> getTache(@PathVariable Long id) {
			return tacheDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteTache(@PathVariable Long id) {
			tacheDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Tache updateTache(@RequestBody Tache tache) {
			return tacheDAO.save(tache);
		}
		@PostMapping(value = "new")
		public Tache createTache(@RequestBody Tache tache) {
			return tacheDAO.save(tache);
		}
	}


