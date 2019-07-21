package com.smartopo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Recette {
	@Id
	@GeneratedValue
	private Long id;
	private String intitule;
	private double montant;
	private Date date;
	public Recette() {
		super();
	}
	public Recette(Long id, String intitule, double montant, Date date) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.montant = montant;
		this.date = date;
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
}
