package com.example.examen2Back1.service;

import com.example.examen2Back1.model.Empleado;
import com.example.examen2Back1.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) { this.empleadoRepository = empleadoRepository; }

    public Empleado createEmpleado(Empleado empleado) {
        if (empleado.getSalary() != null && empleado.getSalary() < 0){
            throw new IllegalArgumentException("Empleado salary must be non-negative");
        }
        return empleadoRepository.save(empleado);
    }
}
