package upn.apicalidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.PeriodoNominaModel;

@Repository
public interface PeriodoNominaRepository extends JpaRepository<PeriodoNominaModel,Integer>{
    
}
