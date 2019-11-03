package com.smartopo.controllers;


import java.util.ArrayList;
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
import com.smartopo.DAO.EmployeDAO;
import com.smartopo.DAO.RecetteDAO;
import com.smartopo.DAO.TacheDAO;
import com.smartopo.entities.Depense_Charge;
import com.smartopo.entities.Employe;
import com.smartopo.entities.Recette;
import com.smartopo.entities.Tache;

@RestController
@RequestMapping(value = "/recettes/")
@CrossOrigin(origins = "http://localhost:4200")
public class RecetteController {


		@Autowired
		private RecetteDAO recetteDAO;
		
		@Autowired
		private EmployeDAO employeDAO;
		
		@Autowired
		private TacheDAO tacheDAO;
		
		@Autowired
		private Depense_ChargeDAO depenseDAO;
		
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
		@GetMapping(value="employeTachesDepensesCorrelation")
		public List<Object> getEmployesTachesDepensesCorrelation() {
			class Correlation {
				String employeCin;
				Long idTache;
				double depense;
				
				public Correlation(String e, Long id, double dep) {
					this.employeCin = e;
					this.idTache = id;
					this.depense = dep;
				}
			}
			List<Object> myList = new ArrayList<Object>();
			List<Tache> taches = tacheDAO.findAll();
			List<Employe> employes = employeDAO.findAll();
			List<Depense_Charge> depenses = depenseDAO.findAll();
			
			for (Tache tache : taches) {
				for (Depense_Charge depense : depenses) {
					if(tache.getId() == depense.getTache().getId()) {
						for (Employe employe : employes) {
							if(employe.getId() == tache.getEmploye_responsable().getId()) {								
								Correlation c = new Correlation(employe.getCin(), tache.getId(), depense.getMontant());
								myList.add(c);
							}
						}
					}
				}
			}
			
			return myList;
		}
	}


