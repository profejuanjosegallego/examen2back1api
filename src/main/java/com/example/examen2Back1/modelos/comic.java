package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50, nullable = false)
    private String titulo;

    @Column(length = 50, nullable = false)
    private String descripcion;

    @Column(length = 50, nullable = false)
    private String autor;

    @Column(length = 50, nullable = false)
    private String editorial;

    @Column(length = 50, nullable = false)
    private LocalDate fechaPublicacion;

    @Column(length = 50, nullable = false)
    private Integer precio;

    @Column(length = 50, nullable = false)
    private String stock;

    @Column(length = 50, nullable = false)
    private String genero;

    @Column(length = 50, nullable = false)
    private String codigoBarras;

    public comic() {
    }

    public comic(long id, String titulo, String descripcion, String autor, String editorial, LocalDate fechaPublicacion, Integer precio, String stock, String genero, String codigoBarras) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.stock = stock;
        this.genero = genero;
        this.codigoBarras = codigoBarras;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}
