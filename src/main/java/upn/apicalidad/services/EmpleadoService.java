package upn.apicalidad.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public EmpleadoModel guardarEmpleado(EmpleadoModel empleado){
        return empleadoRepository.save(empleado);
    }
    public Optional<EmpleadoModel> obtenerPorCorreo(String email){
        return empleadoRepository.findByCorreo(email);
    }
} 