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

import com.smartopo.DAO.MaterielDAO;
import com.smartopo.entities.Materiel;

@RestController
@RequestMapping(value = "/materiels/")

public class MaterielController {


		@Autowired
		private MaterielDAO materielDAO;
		
		@GetMapping(value = "all")
		public List<Materiel> getMateriels(){
			return materielDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Materiel> getMateriel(@PathVariable Long id) {
			return materielDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteMateriel(@PathVariable Long id) {
			materielDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Materiel updateMateriel(@RequestBody Materiel materiel) {
			return materielDAO.save(materiel);
		}
		@PostMapping(value = "new")
		public Materiel createMateriel(@RequestBody Materiel materiel) {
			return materielDAO.save(materiel);
		}
	}


