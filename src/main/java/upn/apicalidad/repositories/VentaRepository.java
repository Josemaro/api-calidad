package upn.apicalidad.repositories;
import java.util.ArrayList;

import upn.apicalidad.models.VentaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<VentaModel,Long> {
    public abstract ArrayList<VentaModel> findByTipocomprobante(String tipocomprobante);
    public abstract ArrayList<VentaModel> findByNumcomprobante(String numcomprobante);  
}