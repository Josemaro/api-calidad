package upn.apicalidad.dto;
import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import upn.apicalidad.models.IncidenciaLaboralModel;
import upn.apicalidad.models.NominaModel;

@AllArgsConstructor
@NoArgsConstructor
public class PeriodoNominaDto {
    @Getter @Setter
    private int periodo_nomina_id;
    @Getter @Setter
    private String descripcion;
    @Getter @Setter
    private LocalDateTime fechaInicio;
    @Getter @Setter
    private LocalDateTime fechaFin;
	@Getter @Setter
	private Set<IncidenciaLaboralModel> incidenciaLaboral;
	@Getter @Setter
	private Set<NominaModel> nominas;

}
