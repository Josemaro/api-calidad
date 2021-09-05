package upn.apicalidad.models;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contrato")
public class ContratoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Getter @Setter
    private int contrato_id;

    @Getter @Setter
    private String nombres;
    @Getter @Setter
    private LocalDateTime fechaInicio;
    @Getter @Setter
    private LocalDateTime fechaFin; 
    @Getter @Setter
    private Boolean tieneAsignacionFamiliar;
    @Getter @Setter
    private int horasPorSemana;
    @Getter @Setter
    private Double pagoPorHora;
    @Getter @Setter
    private String puesto;
    @Getter @Setter
    private Boolean cancelado;

    @Getter @Setter
    @OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="afp_id")
    private AfpModel afp;

    @Getter @Setter
    @OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="empleado_id")
    EmpleadoModel empleado;
}
