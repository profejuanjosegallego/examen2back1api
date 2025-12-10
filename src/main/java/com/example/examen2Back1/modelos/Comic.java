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

    @ManyToOne
    @JoinColumn(name = "Id_pedido")
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    public Comic() {
    }

    public Comic(Long idComic, String nombreComic, String autor, String editorial, LocalDate fechaPublicacion, Integer numeroEdicion, String genero, Double precio, Boolean estaDisponible, Integer cantidadDisponible, String isbn) {
        this.idComic = idComic;
        this.nombreComic = nombreComic;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroEdicion = numeroEdicion;
        this.genero = genero;
        this.precio = precio;
        this.estaDisponible = estaDisponible;
        this.cantidadDisponible = cantidadDisponible;
        this.isbn = isbn;
    }

    public Long getIdComic() {
        return idComic;
    }

    public void setIdComic(Long idComic) {
        this.idComic = idComic;
    }

    public String getNombreComic() {
        return nombreComic;
    }

    public void setNombreComic(String nombreComic) {
        this.nombreComic = nombreComic;
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

    public Integer getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(Integer numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(Boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
