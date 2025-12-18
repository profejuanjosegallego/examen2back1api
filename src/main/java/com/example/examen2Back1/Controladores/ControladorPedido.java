package com.example.examen2Back1.Controladores;

import com.example.examen2Back1.Servicios.ServicioPedido;
import com.example.examen2Back1.modelos.Pedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
public class ControladorPedido {
    private final ServicioPedido servicio;

    public ControladorPedido(ServicioPedido servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public ResponseEntity<Pedido> guardar(@RequestBody Pedido datos) {
        Pedido respuestaDeApi = this.servicio.guardarpedido(datos);
        return ResponseEntity.status(HttpStatus.OK).body(respuestaDeApi);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> buscarTodos() {
        List<Pedido> pedidos = this.servicio.buscarTodos();
        return ResponseEntity.ok(pedidos);
    }
}


