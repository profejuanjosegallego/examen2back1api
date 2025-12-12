package com.example.examen2Back1.controladores;

import com.example.examen2Back1.modelos.Empleado;
import com.example.examen2Back1.servicios.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empleados")
public class ControladorEmpleado {
    @Autowired
    ServicioEmpleado servicioEmpleado;
    @PostMapping
    public ResponseEntity<Empleado>guardar(@RequestBody Empleado datos){
        Empleado respuestaDelApi=this.servicioEmpleado.guardarEmpleado(datos);

        return ResponseEntity.status(HttpStatus.OK).body(respuestaDelApi);
    }


}
