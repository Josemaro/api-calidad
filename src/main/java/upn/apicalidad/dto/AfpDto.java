package upn.apicalidad.dto;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import upn.apicalidad.models.ContratoModel;

@NoArgsConstructor
@AllArgsConstructor
public class AfpDto {
  
    @Getter @Setter
    private int afp_id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private Double porcentajeDescuento;
	@Getter @Setter
	private Set<ContratoModel> contratos;

}
