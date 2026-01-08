package com.example.examen2Back1.controllers;

import com.example.examen2Back1.model.Cliente;
import com.example.examen2Back1.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){this.clienteService = clienteService;}
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Cliente cliente){
        try {
            Cliente saved = clienteService.createCliente(cliente);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);
        } catch (IllegalArgumentException ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

}
