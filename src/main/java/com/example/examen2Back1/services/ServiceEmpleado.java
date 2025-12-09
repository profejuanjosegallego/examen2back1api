package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Empleado;
import com.example.examen2Back1.repositories.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServiceEmpleado {
    @Autowired
    private IEmpleado repositorio;

    public Empleado saveEmpleado(Empleado empleado) {

        if(empleado.getFirstName() == null || empleado.getFirstName().equalsIgnoreCase("")){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Error al digital el empleado, el nombre no debe estar vacio o ser nulo");
        }

        return repositorio.save(empleado);
    }
}
