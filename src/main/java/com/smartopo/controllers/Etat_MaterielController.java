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

import com.smartopo.DAO.Etat_MaterielDAO;

import com.smartopo.entities.Etat_Materiel;

@RestController
@RequestMapping(value = "/etat_materiels/")
public class Etat_MaterielController {

	@Autowired
	private Etat_MaterielDAO etat_MaterielDAO;
	
	@GetMapping(value = "all")
	public List<Etat_Materiel> getEtat_Materiels(){
		return etat_MaterielDAO.findAll();
	}
	
	@GetMapping(value = "all/{id}")
	public Optional<Etat_Materiel> getEtat_Materiel(@PathVariable Long id) {
		return etat_MaterielDAO.findById(id);
	} 
	@DeleteMapping(value = "delete/{id}")
	public boolean deleteEtat_Materiel(@PathVariable Long id) {
		etat_MaterielDAO.deleteById(id);
		return true;
	}
	@PutMapping(value = "update")
	public Etat_Materiel updateEtat_Materiel(@RequestBody Etat_Materiel etat_Materiel) {
		return etat_MaterielDAO.save(etat_Materiel);
	}
	@PostMapping(value = "new")
	public Etat_Materiel createEtat_Materiel(@RequestBody Etat_Materiel etat_Materiel) {
		return etat_MaterielDAO.save(etat_Materiel);
	}

}
