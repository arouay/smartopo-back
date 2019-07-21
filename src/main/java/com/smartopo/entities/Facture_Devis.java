package com.smartopo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Facture_Devis {
	@Id
	@GeneratedValue
	private Long id;
	private String objet;
	private Date date;
	private String type;
	
	@OneToMany
	private List<Article> articles = new ArrayList<>();
	
	public Facture_Devis() {
		super();
	}
	public Facture_Devis(Long id, String objet, Date date, String type) {
		super();
		this.id = id;
		this.objet = objet;
		this.date = date;
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
