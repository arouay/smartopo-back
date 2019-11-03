package com.smartopo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity
public class Tache {
	@Id
	@GeneratedValue
	private Long id;
	private int duree_estimee;
	private Date date_commancement;	
	private int priorite;
	private int avancement;
	
	@ManyToOne
	private Employe employe_responsable;
	
	@ManyToOne
	private Phase phase;
	
	public Tache() {
		super();
	}
	public Tache(Long id, int duree_estimee, Date date_commancement, int priorite, Employe employe, Phase phase, int avancement) {
		super();
		this.id = id;
		this.avancement = avancement;
		this.duree_estimee = duree_estimee;
		this.date_commancement = date_commancement;
		this.priorite = priorite;
		this.phase = phase;
		this.employe_responsable = employe;
	}

	public int getAvancement() {
		return avancement;
	}
	public void setAvancement(int avancement) {
		this.avancement = avancement;
	}
	public Employe getEmploye_responsable() {
		return employe_responsable;
	}
	public void setEmploye_responsable(Employe employe_responsable) {
		this.employe_responsable = employe_responsable;
	}
	public Phase getPhase() {
		return phase;
	}
	public void setPhase(Phase phase) {
		this.phase = phase;
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
