package com.example.examen2Back1.modelos;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaPedido;

    @Column(length = 20, nullable = false)
    private String estado;

    @Column(nullable = false)
    private Double total;

    @Column(length = 50, nullable = false)
    private String metodoPago;

    @Column(length = 100, nullable = false)
    private String direccionEnvio;

    @Column(length = 10, nullable = false)
    private String codigoPostal;

    @Column(length = 50, nullable = false)
    private String ciudadEnvio;

    @Column(length = 50, nullable = false)
    private String paisEnvio;

    @Column(length = 50, nullable = false)
    private String numeroSeguimiento;

    @Column(length = 255)
    private String observaciones;

    @Column(length = 100, nullable = false)
    private String clienteNombre;

    public Pedido() {
    }

    public Pedido(Long id, LocalDateTime fechaPedido, String estado, Double total, String metodoPago, String direccionEnvio, String codigoPostal, String ciudadEnvio, String paisEnvio, String numeroSeguimiento, String observaciones, String clienteNombre) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.total = total;
        this.metodoPago = metodoPago;
        this.direccionEnvio = direccionEnvio;
        this.codigoPostal = codigoPostal;
        this.ciudadEnvio = ciudadEnvio;
        this.paisEnvio = paisEnvio;
        this.numeroSeguimiento = numeroSeguimiento;
        this.observaciones = observaciones;
        this.clienteNombre = clienteNombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudadEnvio() {
        return ciudadEnvio;
    }

    public void setCiudadEnvio(String ciudadEnvio) {
        this.ciudadEnvio = ciudadEnvio;
    }

    public String getPaisEnvio() {
        return paisEnvio;
    }

    public void setPaisEnvio(String paisEnvio) {
        this.paisEnvio = paisEnvio;
    }

    public String getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(String numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }
}
