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
    private IPedido rPedido;

    public Pedido guardarPedido(Pedido datosPedido){
        if (datosPedido.getObservaciones()==null || datosPedido.getObservaciones()==""||datosPedido.getObservaciones().length()<4){
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "La observación es muy corta, se mas especifico"
            );
        }
        return this.rPedido.save(datosPedido);
    }

}
