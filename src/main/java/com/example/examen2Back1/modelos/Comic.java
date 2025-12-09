package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

@Entity
@Table (name = "comic")
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Double precioVenta;
    private Double precioOriginal;
    private Double porcentajeDescuento;
    private String moneda;
    private boolean esOfertaLimitada;
    private boolean aceptaOfertas;
    private String condicion;
    private String gradoEstado;

    public Comic() {
    }

    public Comic(long id, Double precioVenta, Double precioOriginal, Double porcentajeDescuento, String moneda, boolean esOfertaLimitada, boolean aceptaOfertas, String condicion, String gradoEstado) {
        this.id = id;
        this.precioVenta = precioVenta;
        this.precioOriginal = precioOriginal;
        this.porcentajeDescuento = porcentajeDescuento;
        this.moneda = moneda;
        this.esOfertaLimitada = esOfertaLimitada;
        this.aceptaOfertas = aceptaOfertas;
        this.condicion = condicion;
        this.gradoEstado = gradoEstado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(Double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public boolean isEsOfertaLimitada() {
        return esOfertaLimitada;
    }

    public void setEsOfertaLimitada(boolean esOfertaLimitada) {
        this.esOfertaLimitada = esOfertaLimitada;
    }

    public boolean isAceptaOfertas() {
        return aceptaOfertas;
    }

    public void setAceptaOfertas(boolean aceptaOfertas) {
        this.aceptaOfertas = aceptaOfertas;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getGradoEstado() {
        return gradoEstado;
    }

    public void setGradoEstado(String gradoEstado) {
        this.gradoEstado = gradoEstado;
    }
}
