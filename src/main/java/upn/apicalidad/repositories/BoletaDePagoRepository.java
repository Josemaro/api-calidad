package upn.apicalidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.BoletaDePagoModel;

@Repository
public interface BoletaDePagoRepository extends JpaRepository<BoletaDePagoModel,Integer> {
        
}
