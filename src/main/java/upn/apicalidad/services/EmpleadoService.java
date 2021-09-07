package upn.apicalidad.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upn.apicalidad.dto.EmpleadoDto;
import upn.apicalidad.models.EmpleadoModel;
import upn.apicalidad.repositories.EmpleadoRepository;


@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;
    
    public ArrayList<EmpleadoModel> getAll(){
        return(ArrayList<EmpleadoModel>)empleadoRepository.findAll();
    }
    public boolean existsByEmail(String email) {
        return empleadoRepository.existsByCorreo(email);
    }
    public EmpleadoModel guardarEmpleado(EmpleadoDto empleadoDto){
        EmpleadoModel empleado = new EmpleadoModel();

        empleado.setEmpleado_id(empleadoDto.getEmpleado_id());
        empleado.setNombres(empleadoDto.getNombres());
        empleado.setApellidos(empleadoDto.getApellidos());
        empleado.setDni(empleadoDto.getDni());
        empleado.setFechaNacimiento(empleadoDto.getFechaNacimiento());
        empleado.setTelefono(empleadoDto.getTelefono());
        empleado.setCorreo(empleadoDto.getCorreo());
        empleado.setDireccion(empleadoDto.getDireccion());
        empleado.setContratos(empleadoDto.getContratos());

        return empleadoRepository.save(empleado);
    }
    public Optional<EmpleadoModel> obtenerPorCorreo(String email){
        return empleadoRepository.findByCorreo(email);
    }
}