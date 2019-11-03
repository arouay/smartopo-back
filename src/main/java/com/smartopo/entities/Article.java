package com.smartopo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private int quantite;
	private double prix;
	
	@ManyToOne
	private Facture_Devis facture_devis;
	
	public Article() {
		super();
	}
	public Article(Long id, String designation, int quantite, double prix, Facture_Devis fd) {
		super();
		this.id = id;
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
		this.facture_devis = fd;
	}
	public Facture_Devis getFacture_devis() {
		return facture_devis;
	}
	public void setFacture_devis(Facture_Devis facture_devis) {
		this.facture_devis = facture_devis;
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
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
}
