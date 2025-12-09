package com.example.examen2Back1.modelos;


import jakarta.persistence.*;
@Entity
@Table (name = "pedido")
public class Pedido {

    private Long id;
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigoPedido;
    private String fechaCreacion;
    private String fechaEntregaEstimada;
    private Double montoTotal;
    private String metodoPago;
    private String estadoPedido;
    private String tipoEntrega;
    private Double costoEnvio;
    private Integer numeroItems;
    private String observaciones;

    private  Pedido pedido;
    public Pedido() {
    }

    public Pedido(Long id, String codigoPedido, String fechaCreacion, String fechaEntregaEstimada, Double montoTotal, String metodoPago, String estadoPedido, String tipoEntrega, Double costoEnvio, Integer numeroItems, String observaciones, Pedido pedido) {
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
        this.pedido = pedido;
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

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaEntregaEstimada() {
        return fechaEntregaEstimada;
    }

    public void setFechaEntregaEstimada(String fechaEntregaEstimada) {
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


}
