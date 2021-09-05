package upn.apicalidad.controllers;
import java.util.ArrayList;

import upn.apicalidad.dto.ejemplosDto.VentaDto;
import upn.apicalidad.services.EjemploService.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaService ventaService;

    @GetMapping("/listar")
    public ArrayList<VentaDto> obtenerVentas(){
        return (ArrayList<VentaDto>) ventaService.obtenerVentas();
    }

}