package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Pedido;
import com.example.examen2Back1.repositorios.IPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServicioPedido {

    @Autowired
    private IPedido repositorio;

    public Pedido guardarPedido (Pedido pedido){
        if (pedido.getDireccionEnvio() == null || pedido.getDireccionEnvio().equalsIgnoreCase("")){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Error al digitar el pedido, la direccion de envio no debe de estar vacio o nulo");
        }

        return repositorio.save(pedido);
    }
}
