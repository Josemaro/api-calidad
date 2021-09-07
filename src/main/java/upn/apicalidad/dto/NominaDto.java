package upn.apicalidad.dto;
import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import upn.apicalidad.models.BoletaDePagoModel;

@AllArgsConstructor
@NoArgsConstructor
public class NominaDto {
    @Getter @Setter
    private int nomina_id;
    @Getter @Setter
    private String descripcion;
    @Getter @Setter
    private LocalDateTime fecha;
    @Getter @Setter
    private Boolean cerrada;
    @Getter @Setter
    private int periodo_nomina_id;
	@Getter @Setter
	private Set<BoletaDePagoModel> boletas;
}
