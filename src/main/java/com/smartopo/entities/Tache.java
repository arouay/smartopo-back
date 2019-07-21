package com.smartopo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tache {
	@Id
	@GeneratedValue
	private Long id;
	private int duree_estimee;
	private Date date_commancement;	
	private int priorite;
	
	@ManyToOne
	private Employe employe_responsable;
	
	@OneToMany
	private List<Depense_Charge> depensesCharges = new ArrayList<>();
	
	public Tache() {
		super();
	}
	public Tache(Long id, int duree_estimee, Date date_commancement, int priorite) {
		super();
		this.id = id;
		this.duree_estimee = duree_estimee;
		this.date_commancement = date_commancement;
		this.priorite = priorite;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public int getPriorite() {
		return priorite;
	}
	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}
}
