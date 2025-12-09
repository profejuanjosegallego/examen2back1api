package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Pedido;
import com.example.examen2Back1.repositories.IPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServicePedido {
    @Autowired
    private IPedido repositorio;

    public Pedido savePedido(Pedido pedido) {

        if(pedido.getDireccionEnvio() == null || pedido.getDireccionEnvio().equalsIgnoreCase("")){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Error al digitar el pedido, la direccion de envio no debe estar vacia o ser nula");
        }

        return repositorio.save(pedido);
    }
}
