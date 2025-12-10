package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

@Entity
@Table
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    @Column(length = 50, nullable = false)
    private int idCliente;
    @Column(length = 50, nullable = false)
    private String fechaPedido;
    @Column(length = 50, nullable = false)
    private String metodoPago;
    @Column(length = 50, nullable = false)
    private double total;
    @Column(length = 50, nullable = false)
    private String estadoPedido;
    @Column(length = 50, nullable = false)
    private String direccionEnvio;
    @Column(length = 50, nullable = false)
    private double costoEnvio;
    @Column(length = 50, nullable = false)
    private String comentarios;
    @Column(length = 50, nullable = false)
    private String fechaEntregaEstimada;


    public Pedido(){
    }

    public Pedido(int idPedido, String fechaEntregaEstimada, double costoEnvio, String comentarios, String direccionEnvio, String estadoPedido, double total, String metodoPago, String fechaPedido, int idCliente) {
        this.idPedido = idPedido;
        this.fechaEntregaEstimada = fechaEntregaEstimada;
        this.costoEnvio = costoEnvio;
        this.comentarios = comentarios;
        this.direccionEnvio = direccionEnvio;
        this.estadoPedido = estadoPedido;
        this.total = total;
        this.metodoPago = metodoPago;
        this.fechaPedido = fechaPedido;
        this.idCliente = idCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaEntregaEstimada() {
        return fechaEntregaEstimada;
    }

    public void setFechaEntregaEstimada(String fechaEntregaEstimada) {
        this.fechaEntregaEstimada = fechaEntregaEstimada;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
