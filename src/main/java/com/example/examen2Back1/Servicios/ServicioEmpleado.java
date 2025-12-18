package com.example.examen2Back1.Servicios;

import com.example.examen2Back1.Repositorios.IEmpleadoRepositorio;
import com.example.examen2Back1.modelos.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServicioEmpleado {
    @Autowired
    private IEmpleadoRepositorio repositorio;

    public Empleado guardarempleado (Empleado datosempleado) {

        //Validar que nombre no esté vacío:
        if (datosempleado.getNombre()==null || datosempleado.getNombre().length()<4) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "El nombre ingresado no cumple con los requisitos establecidos"
            );
        }
        return this.repositorio.save(datosempleado);
    }

    public List<Empleado> buscarTodos() {
        return this.repositorio.findAll();
    }
}
