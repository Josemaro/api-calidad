package upn.apicalidad.models;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "afp")
public class AfpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Getter @Setter
    private int afp_id;

    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private Double porcentajeDescuento;
}
