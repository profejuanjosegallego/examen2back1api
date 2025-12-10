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

   public Cliente guardarCliente(Cliente cliente){

       if (cliente.getNombreCompleto() == null || cliente.getNombreCompleto().equalsIgnoreCase("")){
           throw new ResponseStatusException(HttpStatus.CONFLICT, "Eroor al digitar cliente, el nombre no debe se vacio o nulo");
       }
       return repositorio.save(cliente);
   }
}
