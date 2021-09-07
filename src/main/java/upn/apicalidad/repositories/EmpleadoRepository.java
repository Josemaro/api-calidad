package upn.apicalidad.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.EmpleadoModel;


@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoModel,Integer>{
    public abstract Optional<EmpleadoModel> findByDni(String dni);
    public abstract Optional<EmpleadoModel> findByCorreo(String correo);
    public abstract boolean existsByCorreo(String correo);
}
