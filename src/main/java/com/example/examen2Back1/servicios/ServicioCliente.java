package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Cliente;
import com.example.examen2Back1.repositorios.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioCliente {

    @Autowired
    private ICliente repositorio;

    public Cliente guardarCliente(Cliente cliente) {
        if (cliente.getNombre() == null || cliente.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente es obligatorio");
        }
        return this.repositorio.save(cliente);
    }
}
