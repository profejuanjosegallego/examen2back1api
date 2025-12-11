package com.example.examen2Back1.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "comics")
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String titulo;

    @Column(length = 30)
    private String autor;

    @Column(length = 30)
    private String editorial;

    @Column(length = 20)
    private LocalDate fechaPublicacion;

    private Integer stock;

    @Column(length = 50)
    private String genero;

    @Column(length = 2000)
    private String descripcion;

    @Column(length = 40)
    private String numeroEdicion;

    @Column(length = 50)
    private String imagenPortada;

    @Column(length = 40)
    private String isbn;

    @ManyToMany(mappedBy = "comic", fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    public Comic() {
    }

    public Comic(Integer id, String titulo, String autor, String editorial, LocalDate fechaPublicacion, Integer stock, String genero, String descripcion, String numeroEdicion, String imagenPortada, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.stock = stock;
        this.genero = genero;
        this.descripcion = descripcion;
        this.numeroEdicion = numeroEdicion;
        this.imagenPortada = imagenPortada;
        this.isbn = isbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(String numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getImagenPortada() {
        return imagenPortada;
    }

    public void setImagenPortada(String imagenPortada) {
        this.imagenPortada = imagenPortada;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", stock=" + stock +
                ", genero='" + genero + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numeroEdicion='" + numeroEdicion + '\'' +
                ", imagenPortada='" + imagenPortada + '\'' +
                ", isbn='" + isbn + '\'' +
                ", orders=" + orders +
                '}';
    }
}
