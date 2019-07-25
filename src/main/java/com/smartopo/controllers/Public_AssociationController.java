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

import com.smartopo.DAO.Public_AssociationDAO;
import com.smartopo.entities.Public_Association;

@RestController
@RequestMapping(value = "/phases_associations/")

public class Public_AssociationController {


		@Autowired
		private Public_AssociationDAO public_associationDAO;
		
		@GetMapping(value = "all")
		public List<Public_Association> getPublic_Association(){
			return public_associationDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Public_Association> getPublic_Association(@PathVariable Long id) {
			return public_associationDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deletePublic_Association(@PathVariable Long id) {
			public_associationDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Public_Association updatePublic_Association(@RequestBody Public_Association public_association) {
			return public_associationDAO.save(public_association);
		}
		@PostMapping(value = "new")
		public Public_Association createPublic_Association(@RequestBody Public_Association public_association) {
			return public_associationDAO.save(public_association);
		}
	}


