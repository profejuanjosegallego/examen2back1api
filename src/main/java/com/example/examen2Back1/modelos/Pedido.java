package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedido_id;

    @Column(length = 8, nullable = false)
    private LocalDate fecha_pedido;

    @Column(length = 30, nullable = false)
    private String estado_pedido;

    @Column(nullable = false)
    private Double monto_subtotal;

    @Column(nullable = false)
    private Double monto_impuestos;

    @Column(nullable = false)
    private Double monto_total;

    @Column(nullable = false)
    private String metodo_pago;

    @Column(length = 100, nullable = false)
    private String direccion_envio;

    @Column(length = 8, nullable = false)
    private LocalDate fecha_entrega_estimada;

    @Column(nullable = false)
    private String codigo_seguimiento;

    @Column(nullable = false)
    private Float peso_Paquete;

    public Pedido() {
    }

    public Pedido(Long pedido_id, LocalDate fecha_pedido, String estado_pedido, Double monto_subtotal, Double monto_impuestos, Double monto_total, String metodo_pago, String direccion_envio, LocalDate fecha_entrega_estimada, String codigo_seguimiento, Float peso_Paquete) {
        this.pedido_id = pedido_id;
        this.fecha_pedido = fecha_pedido;
        this.estado_pedido = estado_pedido;
        this.monto_subtotal = monto_subtotal;
        this.monto_impuestos = monto_impuestos;
        this.monto_total = monto_total;
        this.metodo_pago = metodo_pago;
        this.direccion_envio = direccion_envio;
        this.fecha_entrega_estimada = fecha_entrega_estimada;
        this.codigo_seguimiento = codigo_seguimiento;
        this.peso_Paquete = peso_Paquete;
    }

    public Long getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Long pedido_id) {
        this.pedido_id = pedido_id;
    }

    public LocalDate getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(LocalDate fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public Double getMonto_subtotal() {
        return monto_subtotal;
    }

    public void setMonto_subtotal(Double monto_subtotal) {
        this.monto_subtotal = monto_subtotal;
    }

    public Double getMonto_impuestos() {
        return monto_impuestos;
    }

    public void setMonto_impuestos(Double monto_impuestos) {
        this.monto_impuestos = monto_impuestos;
    }

    public Double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(Double monto_total) {
        this.monto_total = monto_total;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public LocalDate getFecha_entrega_estimada() {
        return fecha_entrega_estimada;
    }

    public void setFecha_entrega_estimada(LocalDate fecha_entrega_estimada) {
        this.fecha_entrega_estimada = fecha_entrega_estimada;
    }

    public String getCodigo_seguimiento() {
        return codigo_seguimiento;
    }

    public void setCodigo_seguimiento(String codigo_seguimiento) {
        this.codigo_seguimiento = codigo_seguimiento;
    }

    public Float getPeso_Paquete() {
        return peso_Paquete;
    }

    public void setPeso_Paquete(Float peso_Paquete) {
        this.peso_Paquete = peso_Paquete;
    }
}
