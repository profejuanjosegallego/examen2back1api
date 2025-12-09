package com.example.examen2Back1.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idEmpleado;

    private String nombreCompleto;
    private String direccion;
    private LocalDate fechaIngreso;
    private String tipoDocumento;
    private String numeroDocumento;
    private String cargo;
    private String correo;
    private String telefono;
    private String area;
}
