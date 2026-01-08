package com.example.examen2Back1.controllers;

import com.example.examen2Back1.model.Empleado;
import com.example.examen2Back1.service.EmpleadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService){this.empleadoService= empleadoService;}

    @PostMapping
    public ResponseEntity<?> create (@RequestBody Empleado empleado) {
        try{
            Empleado saved = empleadoService.createEmpleado(empleado);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
