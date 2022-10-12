package com.example.firstproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Offre {
    @Id
    @GeneratedValue
    Long id;
    String intitulé;
    String specialité;
    String société;
    int nbpostes;
    String pays;

    public Offre() {
    }

    public Offre(String intitulé, String specialité, String société, int nbpostes, String pays) {
        this.intitulé = intitulé;
        this.specialité = specialité;
        this.société = société;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public String getSpecialité() {
        return specialité;
    }

    public void setSpecialité(String specialité) {
        this.specialité = specialité;
    }

    public String getSociété() {
        return société;
    }

    public void setSociété(String société) {
        this.société = société;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Offre{" +
                "id=" + id +
                ", intitulé='" + intitulé + '\'' +
                ", specialité='" + specialité + '\'' +
                ", société='" + société + '\'' +
                ", nbpostes=" + nbpostes +
                ", pays='" + pays + '\'' +
                '}';
    }
}
