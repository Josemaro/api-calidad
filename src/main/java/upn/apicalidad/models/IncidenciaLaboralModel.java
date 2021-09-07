package upn.apicalidad.models;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "incidencia_laboral")
public class IncidenciaLaboralModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Getter @Setter
    private int incidencia_laboral_id;
    @Getter @Setter
    private int totalHorasDeFalta;
    @Getter @Setter
    private int totalHorasExtras;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "contrato_id")
    @Getter @Setter
    private ContratoModel contrato;

    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "periodo_nomina_id")
    @Getter @Setter
    private PeriodoNominaModel periodo_nomina;


}
