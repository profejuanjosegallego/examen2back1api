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
    private ICliente repositorio;

    public Cliente guardarCliente(Cliente datosCliente){
          if (datosCliente.getEsActivo() == false){
                throw new ResponseStatusException(HttpStatus.CONFLICT,"El cliente no esta activo ✖️☠️");
          }
    return this.repositorio.save(datosCliente);
    }

}
