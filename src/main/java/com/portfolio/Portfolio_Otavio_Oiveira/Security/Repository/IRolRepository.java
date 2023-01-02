
package com.portfolio.Portfolio_Otavio_Oiveira.Security.Repository;

import com.portfolio.Portfolio_Otavio_Oiveira.Security.Entity.Rol;
import com.portfolio.Portfolio_Otavio_Oiveira.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
