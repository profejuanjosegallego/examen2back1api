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
    private IEmpleado repositorio;

    public Empleado guardarEmpleado(Empleado datosEmpleado){
        if (datosEmpleado.getArea() == null || datosEmpleado.getArea() == ""){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"El area no puede estar vacia");

        }
        return this.repositorio.save(datosEmpleado);

    }
}
