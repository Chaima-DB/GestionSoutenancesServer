/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.gestionDesSoutenances.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author HP
 */
@Entity
public class SoutenanceJury implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String resultat;
    
   

    @ManyToOne
    private Soutenance soutenance;
    @ManyToOne
    private Jury jury;
    
    
    
            
    public SoutenanceJury() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }


    public Soutenance getSoutenance() {
        return soutenance;
    }

    public void setSoutenance(Soutenance soutenance) {
        this.soutenance = soutenance;
    }

    public Jury getJury() {
        return jury;
    }

    public void setJury(Jury jury) {
        this.jury = jury;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoutenanceJury)) {
            return false;
        }
        SoutenanceJury other = (SoutenanceJury) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SoutenanceJury{" + "id=" + id +  ", soutenance=" + soutenance + ", jury=" + jury + ", resultat=" + resultat +'}';
    }

    
   

    
    
}
