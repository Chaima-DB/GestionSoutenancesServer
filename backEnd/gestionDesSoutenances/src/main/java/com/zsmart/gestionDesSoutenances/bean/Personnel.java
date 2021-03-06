/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.gestionDesSoutenances.bean;

import java.io.Serializable;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author HP
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personnel implements Serializable {

    protected String cin;
    protected String nom;
    protected String prenom;
    protected String sexe;
    protected String email;
    protected String tel;

    @ManyToOne
    protected Specialite specialite;

    
    public Personnel(String cin, String nom, String prenom, String sexe, String email, String tel,
			Specialite specialite) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.email = email;
		this.tel = tel;
		this.specialite = specialite;
	}

	public Personnel() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

}
