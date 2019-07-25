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

import com.smartopo.DAO.ParticulierDAO;
import com.smartopo.entities.Particulier;

@RestController
@RequestMapping(value = "/particuliers/")

public class ParticulierController {


		@Autowired
		private ParticulierDAO particulierDAO;
		
		@GetMapping(value = "all")
		public List<Particulier> getParticuliers(){
			return particulierDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Particulier> getParticulier(@PathVariable Long id) {
			return particulierDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteParticulier(@PathVariable Long id) {
			particulierDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Particulier updateParticulier(@RequestBody Particulier particulier) {
			return particulierDAO.save(particulier);
		}
		@PostMapping(value = "new")
		public Particulier createParticulier(@RequestBody Particulier particulier) {
			return particulierDAO.save(particulier);
		}
	}


