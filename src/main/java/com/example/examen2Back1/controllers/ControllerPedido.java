package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Pedido;
import com.example.examen2Back1.services.ServicePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pedido")
public class ControllerPedido {
    @Autowired
    ServicePedido servicePedido;

    @PostMapping
    public ResponseEntity<Pedido> savePedido(@RequestBody Pedido datosPedido) {
        return ResponseEntity.ok().body(servicePedido.savePedido(datosPedido));
    }
}
