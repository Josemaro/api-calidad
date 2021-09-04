package upn.apicalidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.DetalleVentaModel;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVentaModel,Long>  {
    
}