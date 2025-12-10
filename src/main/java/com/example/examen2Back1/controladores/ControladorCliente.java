package com.example.examen2Back1.controladores;

import com.example.examen2Back1.modelos.Cliente;
import com.example.examen2Back1.servicios.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cliente")
public class ControladorCliente {
    @Autowired
    ServicioCliente servicioCliente;

    @PostMapping
    public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente datosCliente){
        return ResponseEntity.ok().body(servicioCliente.guardarCliente(datosCliente));
    }
}
