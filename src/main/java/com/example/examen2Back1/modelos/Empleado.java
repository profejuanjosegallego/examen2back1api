package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEmpleado;

    @Column(nullable=false)
    private String nombreCompleto;
    private String direccion;
    @Column(nullable=false)
    private LocalDate fechaIngreso;
    @Column(nullable=false)
    private String tipoDocumento;
    @Column(nullable=false, unique=true)
    private String numeroDocumento;
    private String cargo;
    @Column(nullable=false, unique=true)
    private String correo;
    private String telefono;
    @Column(nullable=false)
    private String area;
}
