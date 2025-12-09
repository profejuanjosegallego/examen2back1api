package com.example.examen2Back1.controladores;

import com.example.examen2Back1.modelos.Cliente;
import com.example.examen2Back1.servicios.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("POST /api/clientes")
public class ControladorCliente {
    @Autowired
    ServicioCliente servicioCliente;
    @PostMapping
    public ResponseEntity<Cliente> guardar(@RequestBody Cliente nombre){
        Cliente respuestaDelApi=this.servicioCliente.guardarCliente(nombre);

        return ResponseEntity.status(HttpStatus.OK).body(respuestaDelApi);
    }
}
