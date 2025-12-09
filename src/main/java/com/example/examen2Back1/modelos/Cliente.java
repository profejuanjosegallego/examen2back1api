package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCLiente;
    @Column(length = 150, nullable = false)
    private String nombreCompleto;
    @Column(length = 10, nullable = false)
    private String telefono;
    @Column(length = 150, nullable = false, unique = true)
    private String correo;
    @Column(nullable = false)
    private LocalDate fechaNacimiento;
    @Column(nullable = false)
    private String direccion;
    @Column(length = 150, nullable = false)
    private String pais;
    @Column(nullable = false)
    private Boolean esActivo;
    @Column(nullable = false)
    private String tipoDocumento;
    @Column(nullable = false)
    private String numeroDcumento;
    @Column(nullable = false)
    private String nombreUsuario;
}
