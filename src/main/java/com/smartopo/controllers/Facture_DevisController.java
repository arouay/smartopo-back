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

import com.smartopo.DAO.Facture_DevisDAO;
import com.smartopo.entities.Facture_Devis;

@RestController
@RequestMapping(value = "/factures_devis/")
@CrossOrigin(origins = "http://localhost:4200")
public class Facture_DevisController {


		@Autowired
		private Facture_DevisDAO facture_devisDAO;
		
		@GetMapping(value = "all")
		public List<Facture_Devis> getFactures_Devis(){
			return facture_devisDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Facture_Devis> getFacture_Devis(@PathVariable Long id) {
			return facture_devisDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteFacture_Devis(@PathVariable Long id) {
			facture_devisDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Facture_Devis updateFacture_Devis(@RequestBody Facture_Devis facture_devis) {
			return facture_devisDAO.save(facture_devis);
		}
		@PostMapping(value = "new")
		public Facture_Devis createFacture_Devis(@RequestBody Facture_Devis facture_devis) {
			return facture_devisDAO.save(facture_devis);
		}
	}


