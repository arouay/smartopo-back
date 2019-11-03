package com.smartopo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Materiel {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nom;
	private String marque;
	private boolean etat_achat;
	private Date date_achat;
	@Lob
	private byte[] image_neuf;
	private int quantite;
	public Materiel() {
		super();
	}
	public Materiel(Long id, String nom, String marque, boolean etat_achat, Date date_achat, byte[] image_neuf,
			int quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.marque = marque;
		this.etat_achat = etat_achat;
		this.date_achat = date_achat;
		this.image_neuf = image_neuf;
		this.quantite = quantite;
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
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public boolean isEtat_achat() {
		return etat_achat;
	}
	public void setEtat_achat(boolean etat_achat) {
		this.etat_achat = etat_achat;
	}
	public Date getDate_achat() {
		return date_achat;
	}
	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
	}
	public byte[] getImage_neuf() {
		return image_neuf;
	}
	public void setImage_neuf(byte[] image_neuf) {
		this.image_neuf = image_neuf;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}
