package upn.apicalidad.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upn.apicalidad.models.EmpleadoModel;


@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoModel,Integer>{
    public ArrayList<EmpleadoModel> findByDni(String dni);
    public ArrayList<EmpleadoModel> findByCorreo(String correo);
}
