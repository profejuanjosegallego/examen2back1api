package com.example.examen2Back1.Servicios;

import com.example.examen2Back1.Repositorios.IClienteRepositorio;
import com.example.examen2Back1.modelos.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServicioCliente {
    @Autowired
    private IClienteRepositorio repositorio;

    public Cliente guardarCliente (Cliente datosCliente) {

        //Validar que nombre no esté vacío:
        if (datosCliente.getNombre()==null || datosCliente.getNombre().length()<4) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "El nombre ingresado no cumple con los requisitos establecidos"
            );
        }
        return this.repositorio.save(datosCliente);
    }

    public List<Cliente> buscarTodos() {
        return this.repositorio.findAll();
    }
}
