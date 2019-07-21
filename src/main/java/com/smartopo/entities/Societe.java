package com.smartopo.entities;

import javax.persistence.Entity;

@Entity
public class Societe extends Client {
	private String ice;

	public Societe() {
		super();
	}

	public Societe(String ice) {
		super();
		this.ice = ice;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}
}
