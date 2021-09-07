package upn.apicalidad.dto;
import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import upn.apicalidad.models.ContratoModel;

@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDto {
    @Getter @Setter
    private int empleado_id;
    @Getter @Setter
    private String nombres;
    @Getter @Setter
    private String apellidos;
    @Getter @Setter
    private String dni;
    @Getter @Setter
    private Date fechaNacimiento;
    @Getter @Setter
    private String telefono;
    @Getter @Setter
    private String correo;
    @Getter @Setter
    private String direccion;
	@Getter @Setter
	private Set<ContratoModel> contratos;
}
