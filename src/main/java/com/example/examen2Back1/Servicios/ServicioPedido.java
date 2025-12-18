package com.example.examen2Back1.Servicios;

import com.example.examen2Back1.Repositorios.IPedidoRepositorio;
import com.example.examen2Back1.modelos.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServicioPedido {
    @Autowired
    private IPedidoRepositorio repositorio;

    public Pedido guardarpedido (Pedido datospedido) {

        //Validar que codigo de seguimiento no esté vacío:
        if (datospedido.getCodigo_seguimiento()==null || datospedido.getCodigo_seguimiento().length()<4) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "El codigo de seguimiento ingresado no cumple con los requisitos establecidos"
            );
        }
        return this.repositorio.save(datospedido);
    }

    public List<Pedido> buscarTodos() {
        return this.repositorio.findAll();
    }
}
