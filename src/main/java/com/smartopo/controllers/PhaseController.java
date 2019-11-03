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

import com.smartopo.DAO.PhaseDAO;
import com.smartopo.entities.Phase;

@RestController
@RequestMapping(value = "/phases/")
@CrossOrigin(origins = "http://localhost:4200")
public class PhaseController {


		@Autowired
		private PhaseDAO phaseDAO;
		
		@GetMapping(value = "all")
		public List<Phase> getPhases(){
			return phaseDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Phase> getPhase(@PathVariable Long id) {
			return phaseDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deletePhase(@PathVariable Long id) {
			phaseDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Phase updatePhase(@RequestBody Phase phase) {
			return phaseDAO.save(phase);
		}
		@PostMapping(value = "new")
		public Phase createPhase(@RequestBody Phase phase) {
			return phaseDAO.save(phase);
		}
	}


