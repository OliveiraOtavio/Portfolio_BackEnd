
package com.portfolio.Portfolio_Otavio_Oiveira.Interface;

import com.portfolio.Portfolio_Otavio_Oiveira.Entity.Persona;
import java.util.List;




public interface IPersonaService {
    
    // Para traer una lista de personas
    public List<Persona> getPersona();
    
    // Para guardar un objeto del tipo Persona
    public void savePersona(Persona persona);
    
    // Para eliminar un objeto buscado por ID
    public void deletePersona(Long id);
    
    // Para buscar una persona por ID
    public Persona findPersona(Long id);
}
