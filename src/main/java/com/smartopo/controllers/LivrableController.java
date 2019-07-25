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

import com.smartopo.DAO.LivrableDAO;
import com.smartopo.entities.Livrable;

@RestController
@RequestMapping(value = "/livrables/")

public class LivrableController {


		@Autowired
		private LivrableDAO livrableDAO;
		
		@GetMapping(value = "all")
		public List<Livrable> getLivrables(){
			return livrableDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Livrable> getLivrable(@PathVariable Long id) {
			return livrableDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteLivrable(@PathVariable Long id) {
			livrableDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Livrable updateLivrable(@RequestBody Livrable livrable) {
			return livrableDAO.save(livrable);
		}
		@PostMapping(value = "new")
		public Livrable createLivrable(@RequestBody Livrable livrable) {
			return livrableDAO.save(livrable);
		}
	}


