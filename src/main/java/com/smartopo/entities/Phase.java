package com.smartopo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phase {
	@Id
	@GeneratedValue
	private Long id;
	private String intitule;
	private int duree_estimee;
	private Date date_commancement;
	
	@OneToMany
	private List<Livrable> livrables = new ArrayList<Livrable>();
	
	@OneToMany
	private List<Tache> taches = new ArrayList<>();
	
	public Phase() {
		super();
	}
	public Phase(Long id, String intitule, int duree_estimee, Date date_commancement) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.duree_estimee = duree_estimee;
		this.date_commancement = date_commancement;
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
	public int getDuree_estimee() {
		return duree_estimee;
	}
	public void setDuree_estimee(int duree_estimee) {
		this.duree_estimee = duree_estimee;
	}
	public Date getDate_commancement() {
		return date_commancement;
	}
	public void setDate_commancement(Date date_commancement) {
		this.date_commancement = date_commancement;
	}
	
}
