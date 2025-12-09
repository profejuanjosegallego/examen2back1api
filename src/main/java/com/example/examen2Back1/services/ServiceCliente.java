package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Cliente;
import com.example.examen2Back1.repositories.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServiceCliente {
    @Autowired
    private ICliente repositorio;

    public Cliente saveCliente(Cliente cliente) {

        if(cliente.getFirstName() == null || cliente.getFirstName().equalsIgnoreCase("")){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Error al digital el cliente, el nombre no debe estar vacio o ser nulo");
        }

        return repositorio.save(cliente);
    }


}
