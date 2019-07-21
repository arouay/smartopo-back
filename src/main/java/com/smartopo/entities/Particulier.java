package com.smartopo.entities;

import javax.persistence.Entity;

@Entity
public class Particulier extends Client{
	private String cin;
	private String prenom;
	public Particulier() {
		super();
	}
	public Particulier(String cin, String prenom) {
		super();
		this.cin = cin;
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
