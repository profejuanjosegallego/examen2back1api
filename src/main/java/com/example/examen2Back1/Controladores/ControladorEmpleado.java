package com.example.examen2Back1.Controladores;

import com.example.examen2Back1.Servicios.ServicioEmpleado;
import com.example.examen2Back1.modelos.Empleado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empleados")
public class ControladorEmpleado {
    private final ServicioEmpleado servicio;

    public ControladorEmpleado(ServicioEmpleado servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public ResponseEntity<Empleado> guardar(@RequestBody Empleado datos) {
        Empleado respuestaDeApi = this.servicio.guardarempleado(datos);
        return ResponseEntity.status(HttpStatus.OK).body(respuestaDeApi);
    }

    @GetMapping
    public ResponseEntity<List<Empleado>> buscarTodos() {
        List<Empleado> empleados = this.servicio.buscarTodos();
        return ResponseEntity.ok(empleados);
    }
}


