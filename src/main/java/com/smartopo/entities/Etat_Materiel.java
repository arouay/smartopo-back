package com.smartopo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Etat_Materiel {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Materiel materiel;
	
	@ManyToOne
	private Tache tache;
	
	private Date date;
	private String image_actulle;
	
	public Etat_Materiel() {
		super();
	}
	public Etat_Materiel(Long id, Materiel materiel, Tache tache, Date date, String image_actulle) {
		super();
		this.id = id;
		this.materiel = materiel;
		this.tache = tache;
		this.date = date;
		this.image_actulle = image_actulle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Materiel getMateriel() {
		return materiel;
	}
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	public Tache getTache() {
		return tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getImage_actulle() {
		return image_actulle;
	}
	public void setImage_actulle(String image_actulle) {
		this.image_actulle = image_actulle;
	}
	
	
}
