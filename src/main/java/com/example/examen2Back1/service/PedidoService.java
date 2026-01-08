package com.example.examen2Back1.service;

import com.example.examen2Back1.model.Pedido;
import com.example.examen2Back1.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository){this.pedidoRepository = pedidoRepository; }

    public Pedido createPedido(Pedido pedido) {
        if (pedido.getTotalAmount() == null || BigDecimal.valueOf(pedido.getTotalAmount()).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Pedido totalAmount must be non-negative");
        }
        return pedidoRepository.save(pedido);
    }
}
