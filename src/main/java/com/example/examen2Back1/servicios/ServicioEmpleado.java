package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Empleado;
import com.example.examen2Back1.repositorios.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServicioEmpleado {
    @Autowired
    private IEmpleado rEmpleado;

    public Empleado guardarEmpleado(Empleado datosEmpleado) {
        if (datosEmpleado.getNombre() == null || datosEmpleado.getNombre() == "" || datosEmpleado.getNombre().length() < 4) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "El nombre ingresado no cumple con los criterios de nuestro servicio"
            );
        }

        return this.rEmpleado.save(datosEmpleado);
    }
}

