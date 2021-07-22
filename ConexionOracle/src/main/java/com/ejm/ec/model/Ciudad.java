package com.ejm.ec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "canton")
public class Ciudad {

	@Id
	@Column(name = "codCanton")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_canton;
	
	private int cod_provincia;
	private String nom_canton;
	
	
	public int getCod_canton() {
		return cod_canton;
	}
	public void setCod_canton(int cod_canton) {
		this.cod_canton = cod_canton;
	}
	public int getCod_provincia() {
		return cod_provincia;
	}
	public void setCod_provincia(int cod_rovincia) {
		this.cod_provincia = cod_rovincia;
	}
	public String getNom_canton() {
		return nom_canton;
	}
	public void setNom_canton(String nom_canton) {
		this.nom_canton = nom_canton;
	}
	
}
