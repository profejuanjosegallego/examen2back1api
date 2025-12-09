package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Empleado;
import com.example.examen2Back1.services.ServiceEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/empleado")
public class CotrollerEmpleado {
    @Autowired
    ServiceEmpleado serviceEmpleado;

    @PostMapping
    public ResponseEntity<?> saveEmpleado(@RequestBody Empleado empleado) {
        return ResponseEntity.ok().body(serviceEmpleado.saveEmpleado(empleado));
    }
}
