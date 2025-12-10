package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idPedido;

    @Column(nullable = false)
    private LocalDate fechaPedido;
    @Column(nullable = false)
    private String estadoPedido;
    @Column(nullable = false)
    private String metododepago;
    @Column(nullable = false)
    private Double totalSinIva;
    @Column(nullable = false)
    private Long idCliente;
    @Column(nullable = false)
    private Double costoEnvio;
    @Column(nullable = false)
    private String direccionEnvio;
    @Column(nullable = false)
    private Double impuesto;
    @Column(nullable = false)
    private Float peso;
    @Column(nullable = false)
    private Double totalIva;

    @OneToOne
    @JoinColumn(name = "Fk_Cliente", referencedColumnName = "idCliente")
    private Cliente fkCliente;

    @OneToMany
    @JoinColumn(name = "FK_Comic", referencedColumnName = "idComic")
    private List<Comic> comics;

    public Pedido() {
    }

    public Pedido(Long idPedido, LocalDate fechaPedido, String estadoPedido, String metododepago, Double totalSinIva, Long idCliente, Double costoEnvio, String direccionEnvio, Double impuesto, Float peso, Double totalIva, Cliente fkCliente) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.metododepago = metododepago;
        this.totalSinIva = totalSinIva;
        this.idCliente = idCliente;
        this.costoEnvio = costoEnvio;
        this.direccionEnvio = direccionEnvio;
        this.impuesto = impuesto;
        this.peso = peso;
        this.totalIva = totalIva;
        this.fkCliente = fkCliente;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getMetododepago() {
        return metododepago;
    }

    public void setMetododepago(String metododepago) {
        this.metododepago = metododepago;
    }

    public Double getTotalSinIva() {
        return totalSinIva;
    }

    public void setTotalSinIva(Double totalSinIva) {
        this.totalSinIva = totalSinIva;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(Double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(Double totalIva) {
        this.totalIva = totalIva;
    }

    public Cliente getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(Cliente fkCliente) {
        this.fkCliente = fkCliente;
    }
}
