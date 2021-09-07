package upn.apicalidad.controllers;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import upn.apicalidad.dto.ejemplosDto.Message;
import upn.apicalidad.models.EmpleadoModel;
import upn.apicalidad.services.EmpleadoService;
@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/listar")
    public ArrayList<EmpleadoModel> obtenerVentas(){
        return (ArrayList<EmpleadoModel>) empleadoService.getAll();
    }

    @PostMapping("/guardar")
    public EmpleadoModel guardarEmpleado(@RequestBody EmpleadoModel empleado){
        return this.empleadoService.guardarEmpleado(empleado);
    }
}