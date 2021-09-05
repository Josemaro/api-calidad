package upn.apicalidad.controllers;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
