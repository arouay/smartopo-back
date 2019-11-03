package com.smartopo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Depense_Charge {
	 @Id
	 @GeneratedValue
	 private Long id;
	 
	 private String intitule;
	 private double montant;
	 private Date date;
	 private String type;
	 
	 @ManyToOne
	 private Tache tache;
	 
	public Depense_Charge() {
		super();
	}
	public Depense_Charge(Long id, String intitule, double montant, Date date, String type, Tache tache) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.montant = montant;
		this.date = date;
		this.type = type;
		this.tache = tache;
	}
	public Tache getTache() {
		return tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
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
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
