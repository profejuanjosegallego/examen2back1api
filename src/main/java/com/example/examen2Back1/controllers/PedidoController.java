package com.example.examen2Back1.controllers;

import com.example.examen2Back1.model.Pedido;
import com.example.examen2Back1.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {this.pedidoService = pedidoService; }

    @PostMapping
    public ResponseEntity<?> create (@RequestBody Pedido pedido) {
        try {
            Pedido saved = pedidoService.createPedido(pedido);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
