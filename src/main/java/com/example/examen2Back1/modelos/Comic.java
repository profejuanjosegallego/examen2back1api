package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "comic")
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private Integer numeroEdicion;

    @Column(nullable = false)
    private String editorial;
    private String guionista;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer stock;

    @Column(length = 2000)
    private String sinopsis;

    @Column(length = 500)
    private String urlPortada;
    private LocalDate fechaPublicacion;



    public Comic() {
    }

    public Comic( String titulo, Integer numeroEdicion, String editorial, String guionista, BigDecimal precio, Integer stock, String sinopsis, String urlPortada, LocalDate fechaPublicacion) {

        this.titulo = titulo;
        this.numeroEdicion = numeroEdicion;
        this.editorial = editorial;
        this.guionista = guionista;
        this.precio = precio;
        this.stock = stock;
        this.sinopsis = sinopsis;
        this.urlPortada = urlPortada;
        this.fechaPublicacion = fechaPublicacion;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(Integer numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGuionista() {
        return guionista;
    }

    public void setGuionista(String guionista) {
        this.guionista = guionista;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getUrlPortada() {
        return urlPortada;
    }

    public void setUrlPortada(String urlPortada) {
        this.urlPortada = urlPortada;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
