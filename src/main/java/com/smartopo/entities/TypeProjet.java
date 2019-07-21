package com.smartopo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class TypeProjet {
	@Id
	@GeneratedValue
	private Long id;
	private String designation;
	public TypeProjet() {
		super();
	}
	public TypeProjet(Long id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
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
