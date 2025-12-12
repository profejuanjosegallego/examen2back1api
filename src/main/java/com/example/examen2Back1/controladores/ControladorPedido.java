package com.example.examen2Back1.controladores;

import com.example.examen2Back1.modelos.Pedido;
import com.example.examen2Back1.servicios.ServicioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class ControladorPedido {
    @Autowired
    ServicioPedido servicioPedido;

    @PostMapping
    public ResponseEntity<Pedido> guardar(@RequestBody Pedido datos){
        Pedido respuestaDelApi=this.servicioPedido.guardarPedido(datos);

        return ResponseEntity.status(HttpStatus.OK).body(respuestaDelApi);
    }

}
