
package com.portfolio.Portfolio_Otavio_Oiveira.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    
    private int id;
    private String nombreE;
    private String descripcionE;
    private String conclusionE;
    
    // Constructor

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, String conclusionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.conclusionE = conclusionE;
    }
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getConclusionE() {
        return conclusionE;
    }

    public void setConclusionE(String conclusionE) {
        this.conclusionE = conclusionE;
    }

    
}
