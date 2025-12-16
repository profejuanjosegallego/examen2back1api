package com.example.examen2Back1.controllers;

import com.example.examen2Back1.modelos.cliente;
import com.example.examen2Back1.repositorios.Icliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final Icliente repo;

    public ClienteController(Icliente repo) {
        this.repo = repo;
    }

    @PostMapping
    public cliente crear(@RequestBody cliente cliente) {
        return repo.save(cliente);
    }
}
