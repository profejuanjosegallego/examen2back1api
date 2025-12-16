package com.example.examen2Back1.controllers;

import com.example.examen2Back1.modelos.empleado;
import com.example.examen2Back1.repositorios.Iempleado;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    private final Iempleado repo;

    public EmpleadoController(Iempleado repo) {
        this.repo = repo;
    }

    @PostMapping
    public empleado crear(@RequestBody empleado empleado) {
        return repo.save(empleado);
    }
}
