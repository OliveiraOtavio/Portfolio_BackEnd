
package com.portfolio.Portfolio_Otavio_Oiveira.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;







@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Longitud incorrecta!")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Longitud incorrecta!")
    private String apellido;    
    
    @Size(min = 1, max = 50, message = "Longitud incorrecta!")
    private String img;
    
    
}
