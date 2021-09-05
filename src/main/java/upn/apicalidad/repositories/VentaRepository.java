package upn.apicalidad.repositories;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.ejemplo.VentaModel;

@Repository
public interface VentaRepository extends JpaRepository<VentaModel,Long> {
    public abstract ArrayList<VentaModel> findByTipocomprobante(String tipocomprobante);
    public abstract ArrayList<VentaModel> findByNumcomprobante(String numcomprobante);  
}