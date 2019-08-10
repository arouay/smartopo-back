package com.smartopo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
	@GeneratedValue
	private Long id;
	
	private String cin;
	private String nom;
	private String prenom;
	private String fonction;
	private Date date_naissance;
	private int annees_experiences;
	private Date date_embauche;
	private String email;
	private String adresse;
	private String numero_telephone;
	
	public Employe() {
		super();
	}
	public Employe(Long id, String cin, String nom, String fonction, Date date_naissance, int annees_experiences,
			Date date_embauche, String email, String adresse, String numero_telephone, String prenom) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.date_naissance = date_naissance;
		this.annees_experiences = annees_experiences;
		this.date_embauche = date_embauche;
		this.email = email;
		this.adresse = adresse;
		this.numero_telephone = numero_telephone;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public int getAnnees_experiences() {
		return annees_experiences;
	}
	public void setAnnees_experiences(int annees_experiences) {
		this.annees_experiences = annees_experiences;
	}
	public Date getDate_embauche() {
		return date_embauche;
	}
	public void setDate_embauche(Date date_embauche) {
		this.date_embauche = date_embauche;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumero_telephone() {
		return numero_telephone;
	}
	public void setNumero_telephone(String numero_telephone) {
		this.numero_telephone = numero_telephone;
	}
}
