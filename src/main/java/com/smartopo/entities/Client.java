package com.smartopo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private String nom;
	private String prenom;
	private String cin;
	private String ice;
	private String ville;
	
	public Client() {
		super();
	}
	public Client(Long id, String nom, String ville, String type, String prenom, String ice, String cin) {
		super();
		this.id = id;
		this.nom = nom;
		this.ville = ville;
		this.type = type;
		this.prenom = prenom;
		this.ice = ice;
		this.cin = cin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getIce() {
		return ice;
	}
	public void setIce(String ice) {
		this.ice = ice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
