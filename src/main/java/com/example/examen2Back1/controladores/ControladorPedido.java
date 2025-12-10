package com.example.examen2Back1.controladores;

import com.example.examen2Back1.modelos.Pedido;
import com.example.examen2Back1.servicios.ServicioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pedido")
public class ControladorPedido {

    @Autowired
    ServicioPedido servicioPedido;

    @PostMapping
    public ResponseEntity<Pedido>guardarPedido(@RequestBody Pedido datosPedido){
        return ResponseEntity.ok().body(servicioPedido.guardarPedido(datosPedido));
    }

}
