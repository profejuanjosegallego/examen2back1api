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

    public Pedido guardarPedido(Pedido datosPedido){
        if (datosPedido.getMetododepago() == null || datosPedido.getMetododepago() == ""){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Este campo no puede ir vacio");

        }else if (datosPedido.getTotalIva() <= 0 && datosPedido.getTotalSinIva() <= 0 ) {
            throw new ResponseStatusException(HttpStatus.CONFLICT,"EL total no puede ser cero o menor");        }

        return this.repositorio.save(datosPedido);
    }
}
