package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Comic {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long  idComic;

    @Column(nullable=false)
    private String nombreComic;
    @Column(nullable=false)
    private String autor;
    @Column(nullable=false)
    private String editorial;
    @Column(nullable=false)
    private LocalDate fechaPublicacion;
    @Column(nullable=false)
    private Integer numeroEdicion;
    private String genero;
    @Column(nullable=false)
    private Double precio;
    @Column(nullable=false)
    private Boolean estaDisponible;
    @Column(nullable=false)
    private Integer cantidadDisponible;
    @Column(nullable=false, unique=true)
    private String isbn;
}
