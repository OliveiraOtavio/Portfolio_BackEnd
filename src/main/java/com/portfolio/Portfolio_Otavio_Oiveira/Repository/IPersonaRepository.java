
package com.portfolio.Portfolio_Otavio_Oiveira.Repository;

import com.portfolio.Portfolio_Otavio_Oiveira.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
