package upn.apicalidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.IncidenciaLaboralModel;


@Repository
public interface IncidenciaLaboralRepository extends JpaRepository<IncidenciaLaboralModel,Integer>{
        
}
