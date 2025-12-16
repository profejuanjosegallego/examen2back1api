package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Empleado;
import com.example.examen2Back1.repositorios.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEmpleado {

    @Autowired
    private IEmpleado repositorio;

    public Empleado guardarEmpleado(Empleado empleado) {
        if (empleado.getSalario() == null || empleado.getSalario() <= 0) {
            throw new IllegalArgumentException("El salario del empleado debe ser mayor a 0");
        }
        return repositorio.save(empleado);
    }
}
