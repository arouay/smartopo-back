package com.smartopo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projet {
	@Id
	@GeneratedValue
	private Long id;
	private String intitule;
	private int duree_realisation_estimee;
	private Date date_commencement;
	private double montant_estime;
	private String titre_foncier;
	
	@ManyToOne
	private TypeProjet typeProjet;
	@ManyToOne
	private Client client;
	
	public Projet(Long id, String intitule, int duree_realisation_estimee, Date date_commencement,
			double montant_estime, String titre_foncier, TypeProjet typeProjet, Client client) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.duree_realisation_estimee = duree_realisation_estimee;
		this.date_commencement = date_commencement;
		this.montant_estime = montant_estime;
		this.titre_foncier = titre_foncier;
		this.typeProjet = typeProjet;
		this.client = client;
	}
	public TypeProjet getTypeProjet() {
		return typeProjet;
	}
	public void setTypeProjet(TypeProjet typeProjet) {
		this.typeProjet = typeProjet;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Projet() {
		super();
	}	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getDuree_realisation_estimee() {
		return duree_realisation_estimee;
	}
	public void setDuree_realisation_estimee(int duree_realisation_estimee) {
		this.duree_realisation_estimee = duree_realisation_estimee;
	}
	public Date getDate_commencement() {
		return date_commencement;
	}
	public void setDate_commencement(Date date_commencement) {
		this.date_commencement = date_commencement;
	}
	public double getMontant_estime() {
		return montant_estime;
	}
	public void setMontant_estime(double montant_estime) {
		this.montant_estime = montant_estime;
	}
	public String getTitre_foncier() {
		return titre_foncier;
	}
	public void setTitre_foncier(String titre_foncier) {
		this.titre_foncier = titre_foncier;
	}
}
