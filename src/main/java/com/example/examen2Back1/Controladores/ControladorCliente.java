package com.example.examen2Back1.Controladores;

import com.example.examen2Back1.Servicios.ServicioCliente;
import com.example.examen2Back1.modelos.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ControladorCliente {
    private final ServicioCliente servicio;

    public ControladorCliente(ServicioCliente servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public ResponseEntity<Cliente>guardar(@RequestBody Cliente datos){
        Cliente respuestaDeApi=this.servicio.guardarCliente(datos);
        return ResponseEntity.status(HttpStatus.OK).body(respuestaDeApi);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> buscarTodos() {
        List<Cliente> clientes = this.servicio.buscarTodos();
        return ResponseEntity.ok(clientes);
    }
}
