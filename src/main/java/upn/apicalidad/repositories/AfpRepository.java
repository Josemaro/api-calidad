package upn.apicalidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.AfpModel;

@Repository
public interface AfpRepository extends JpaRepository<AfpModel,Integer>{
    
}
