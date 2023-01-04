
package com.portfolio.Portfolio_Otavio_Oiveira.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String conclusionE;
    
    
    // Constructor

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String conclusionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.conclusionE = conclusionE;
    }
    
    // Getters and Setters

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
    
    public String getConclusionE () {
        return conclusionE;
    }
    
    public void setConclusionE (String conclusionE) {
        this.conclusionE = conclusionE;
    }
    
}
