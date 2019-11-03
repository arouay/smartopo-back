package com.smartopo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livrable {
	@Id
	@GeneratedValue
	private Long id;
	
	private String designation;

	@ManyToOne
	private Phase phase;
	
	public Livrable() {
		super();
	}

	public Livrable(Long id, String designation, Phase phase) {
		super();
		this.id = id;
		this.designation = designation;
		this.phase = phase;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
