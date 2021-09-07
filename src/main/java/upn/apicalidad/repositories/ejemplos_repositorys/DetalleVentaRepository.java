package upn.apicalidad.repositories.ejemplos_repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.ejemplo.DetalleVentaModel;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVentaModel,Long>  {
    
}