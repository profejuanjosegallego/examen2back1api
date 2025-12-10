package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

@Entity
@Table
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComic;
    @Column(length = 50, nullable = false)
    private String titulo;
    @Column(length = 50, nullable = false)
    private String autor;
    @Column(length = 50, nullable = false)
    private String editorial;
    @Column(length = 50, nullable = false)
    private int anioPublicacion;
    @Column(length = 50, nullable = false)
    private double precio;
    @Column(length = 50, nullable = false)
    private String genero;
    @Column(length = 50, nullable = false)
    private int numeroPaginas;
    @Column(length = 50, nullable = false)
    private String estado;
    @Column(length = 50, nullable = false)
    private int stock;


    public Comic(){
    }

    public Comic(Long idComic, int stock, String estado, int numeroPaginas, String genero, double precio, int anioPublicacion, String editorial, String autor, String titulo) {
        this.idComic = idComic;
        this.stock = stock;
        this.estado = estado;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.precio = precio;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.autor = autor;
        this.titulo = titulo;
    }

    public Long getIdComic() {
        return idComic;
    }

    public void setIdComic(Long idComic) {
        this.idComic = idComic;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
