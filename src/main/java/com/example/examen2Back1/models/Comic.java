package com.example.examen2Back1.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_comic")
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false, unique = true)
    private String titulo;

    @Column(length = 30)
    private String autor;

    @Column(length = 30)
    private String editorial;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String sinopsis;

    @Column(length = 30)
    private String genero;

    @Column(name = "stock_disponible")
    private Integer stockDisponible;

    @Column(name = "fecha_de_publicación")
    private LocalDate fechaDePublicacion;

    private Double precio;

    @Column(length = 30)
    private String idioma;

    @Column(length = 40)
    private String estado;

    public Comic(Long id, String titulo, String autor, String editorial, String sinopsis, String genero, Integer stockDisponible, LocalDate fechaDePublicacion, Double precio, String idioma, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.stockDisponible = stockDisponible;
        this.fechaDePublicacion = fechaDePublicacion;
        this.precio = precio;
        this.idioma = idioma;
        this.estado = estado;
    }

    public Comic() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(Integer stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
