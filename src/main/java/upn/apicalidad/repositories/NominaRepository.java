package upn.apicalidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.NominaModel;

@Repository
public interface NominaRepository extends JpaRepository<NominaModel,Integer>{
    
}
