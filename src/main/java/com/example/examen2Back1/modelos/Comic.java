package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="comics")
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_comic;

    @Column(length = 50, nullable = false)
    private String titulo;

    @Column(length = 50, nullable = false)
    private String editorial;

    @Column (length = 10, nullable = false)
    private String codigoSerial;

    @Column (nullable = false)
    private LocalDate fecha_publicacion;

    @Column(length = 30, nullable = false)
    private String autor;

    @Column(nullable = false)
    private Float precio;

    @Column (nullable = false)
    private Integer cantidadStock;

    @Column(length = 30, nullable = false)
    private String genero_Categoria;

    @Column(length = 100, nullable = false)
    private String descripcion;

    private boolean disponible;

    public Comic() {
    }

    public Comic(Long id_comic, String titulo, String editorial, String codigoSerial, LocalDate fecha_publicacion, String autor, Float precio, Integer cantidadStock, String genero_Categoria, String descripcion, Boolean disponible) {
        this.id_comic = id_comic;
        this.titulo = titulo;
        this.editorial = editorial;
        this.codigoSerial = codigoSerial;
        this.fecha_publicacion = fecha_publicacion;
        this.autor = autor;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.genero_Categoria = genero_Categoria;
        this.descripcion = descripcion;
        this.disponible = disponible;
    }

    public Long getId_comic() {
        return id_comic;
    }

    public void setId_comic(Long id_comic) {
        this.id_comic = id_comic;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) { this.editorial = editorial; }

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public void setCodigoSerial(String codigoSerial) {
        this.codigoSerial = codigoSerial;
    }

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDate fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setcantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public String getGenero_Categoria() {
        return genero_Categoria;
    }

    public void setGenero_Categoria(String genero_Categoria) {
        this.genero_Categoria = genero_Categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getdisponible() {
        return disponible;
    }

    public void setdisponible(Boolean disponible) {this.disponible = disponible;}
}
