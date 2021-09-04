package upn.apicalidad.dto;

import java.util.Date;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import upn.apicalidad.models.DetalleVentaModel;
import upn.apicalidad.models.UsuarioModel;

public class VentaDto {
    @Getter @Setter
    private Long idventa;
    @Getter @Setter
    private UsuarioModel usuario;
    @Getter @Setter
    private String tipocomprobante;
    @Getter @Setter
    private String seriecomprobante;
    @Getter @Setter
    private String numcomprobante;
    @Getter @Setter
    private Date fecha;
    @Getter @Setter
    private Long impuesto;
    @Getter @Setter
    private Long total;
    @Getter @Setter
    private String estado;
    @Getter @Setter
    private Set<DetalleVentaModel> lista_detalle_ventas;

}