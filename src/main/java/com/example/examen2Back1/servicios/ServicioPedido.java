package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Pedido;
import com.example.examen2Back1.repositorios.IPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPedido {

    @Autowired
    private IPedido repositorio;

    public Pedido guardarPedido(Pedido pedido) {
        if (pedido.getTotal() == null || pedido.getTotal() <= 0) {
            throw new IllegalArgumentException("El total del pedido debe ser mayor a 0");
        }
        return repositorio.save(pedido);
    }
}
