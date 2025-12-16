package com.example.examen2Back1.controllers;

import com.example.examen2Back1.modelos.pedido;
import com.example.examen2Back1.repositorios.Ipedido;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final Ipedido repo;

    public PedidoController(Ipedido repo) {
        this.repo = repo;
    }

    @PostMapping
    public pedido crear(@RequestBody pedido pedido) {
        return repo.save(pedido);
    }
}
