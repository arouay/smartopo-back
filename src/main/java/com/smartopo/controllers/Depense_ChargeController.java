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

import com.smartopo.DAO.Depense_ChargeDAO;
import com.smartopo.entities.Depense_Charge;

@RestController
@RequestMapping(value = "/depences_charges/")
@CrossOrigin(origins = "http://localhost:4200")
public class Depense_ChargeController {


		@Autowired
		private Depense_ChargeDAO depense_chargeDAO;
		
		@GetMapping(value = "all")
		public List<Depense_Charge> getDepenses_Charges(){
			return depense_chargeDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Depense_Charge> getDepense_Charge(@PathVariable Long id) {
			return depense_chargeDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteDepense_Charge(@PathVariable Long id) {
			depense_chargeDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Depense_Charge updateDepense_Charge(@RequestBody Depense_Charge depense_charge) {
			return depense_chargeDAO.save(depense_charge);
		}
		@PostMapping(value = "new")
		public Depense_Charge createDepense_Charge(@RequestBody Depense_Charge depense_charge) {
			return depense_chargeDAO.save(depense_charge);
		}
	}


