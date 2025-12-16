package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private Integer clienteId;

    @Column(length = 50, nullable = false)
    private LocalDate fechaPedido;

    @Column(length = 50, nullable = false)
    private LocalDate fechaEntrega;

    @Column(length = 50, nullable = false)
    private Boolean estado;

    @Column(length = 50, nullable = false)
    private Integer metodoPago;

    @Column(length = 50, nullable = false)
    private Integer total;

    @Column(length = 50, nullable = false)
    private String direccionEnvio;

    @Column(length = 50, nullable = false)
    private Integer empleadoId;

    @Column(length = 50, nullable = false)
    private String listaItems;



    public pedido() {
    }

    public pedido(Integer id, Integer clienteId, LocalDate fechaPedido, LocalDate fechaEntrega, Boolean estado, Integer metodoPago, Integer total, String direccionEnvio, Integer empleadoId, String listaItems) {
        this.id = id;
        this.clienteId = clienteId;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.total = total;
        this.direccionEnvio = direccionEnvio;
        this.empleadoId = empleadoId;
        this.listaItems = listaItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Integer metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getListaItems() {
        return listaItems;
    }

    public void setListaItems(String listaItems) {
        this.listaItems = listaItems;
    }
}
