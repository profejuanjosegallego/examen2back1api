package com.example.examen2Back1.modelos;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "pedido")
public class Pedido {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codigoPedido;

    @Column(nullable = false)
    private LocalDate fechaCreacion;
    private LocalDate fechaEntregaEstimada;

    @Column(nullable = false)
    private Double montoTotal;

    @Column(nullable = false)
    private String metodoPago;

    @Column(nullable = false)
    private String estadoPedido;
    private String tipoEntrega;
    private Double costoEnvio;

    @Column(nullable = false)
    private Integer numeroItems;
    private String observaciones;


    public Pedido() {
    }

    public Pedido(Long id, String codigoPedido, LocalDate fechaCreacion, LocalDate fechaEntregaEstimada, Double montoTotal, String metodoPago, String estadoPedido, String tipoEntrega, Double costoEnvio, Integer numeroItems, String observaciones) {
        this.id = id;
        this.codigoPedido = codigoPedido;
        this.fechaCreacion = fechaCreacion;
        this.fechaEntregaEstimada = fechaEntregaEstimada;
        this.montoTotal = montoTotal;
        this.metodoPago = metodoPago;
        this.estadoPedido = estadoPedido;
        this.tipoEntrega = tipoEntrega;
        this.costoEnvio = costoEnvio;
        this.numeroItems = numeroItems;
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaEntregaEstimada() {
        return fechaEntregaEstimada;
    }

    public void setFechaEntregaEstimada(LocalDate fechaEntregaEstimada) {
        this.fechaEntregaEstimada = fechaEntregaEstimada;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(Double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public Integer getNumeroItems() {
        return numeroItems;
    }

    public void setNumeroItems(Integer numeroItems) {
        this.numeroItems = numeroItems;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
