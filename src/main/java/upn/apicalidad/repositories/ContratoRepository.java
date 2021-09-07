package upn.apicalidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.ContratoModel;

@Repository
public interface ContratoRepository extends JpaRepository<ContratoModel,Integer>{
        
}
