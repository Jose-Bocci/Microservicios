package com.example.demoOperaciones.controllers;

import com.example.demoOperaciones.clientes.ResultadoClienteRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OperationController {
    @Autowired
    private RestTemplate clienteRest;
    @Autowired
    private ResultadoClienteRest clienteFeign;
    @GetMapping("/sumar")
    public String sumar(@RequestParam float a, @RequestParam float b){
        String resultado = Float.toString(a + b );
        return clienteRest.getForObject("http://localhost:9001/resultado/" + resultado, String.class);
    }
    @GetMapping("/restar")
    public String restar(@RequestParam float a, @RequestParam float b){

        return clienteFeign.mostrarResultado(a-b);
    }
}
