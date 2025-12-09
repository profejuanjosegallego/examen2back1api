package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Cliente;
import com.example.examen2Back1.repositorios.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServicioCliente {

    @Autowired
    private ICliente iCliente;

    public Cliente guardarCliente(Cliente nombreCliente) {
        if(nombreCliente.getNombreCompleto()==null||nombreCliente.getNombreCompleto()==""||nombreCliente.getNombreCompleto().length()<3) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT, "El nombre no cumple con la catidad de caracteres requerido, ingrese un valor valido"
            );
        }
            return this.iCliente.save(nombreCliente);
    }
}
