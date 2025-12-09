package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Cliente;
import com.example.examen2Back1.services.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cliente")
public class CotrollerCliente {
    @Autowired
    ServiceCliente serviceCliente;

    @PostMapping
    public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente datosCliente) {
        return ResponseEntity.ok().body(serviceCliente.saveCliente(datosCliente));
    }
}
