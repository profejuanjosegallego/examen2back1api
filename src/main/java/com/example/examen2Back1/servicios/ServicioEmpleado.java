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

    public Empleado guardarEmpleado(Empleado empleado){
        if (empleado.getNombreCompleto() == null || empleado.getNombreCompleto().equalsIgnoreCase("")){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Error al digitar el empleado, el nombre no debe de estar vacio o nulo");
        }
        return repositorio.save(empleado);
    }
}
