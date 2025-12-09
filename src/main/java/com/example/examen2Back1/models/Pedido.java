package com.example.examen2Back1.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name="tbl_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_pedido", nullable = false)
    private LocalDate fechaPedido;

    @Column(name = "hora_pedido")
    private LocalTime horaPedido;

    @Column(length = 50, nullable = false)
    private String estado;

    @Column(name = "monto_total", nullable = false)
    private Float montoTotal;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "direccion_envio", length = 500)
    private String direccionEnvio;

    @Column(name = "ciudad_envio", length = 100)
    private String ciudadEnvio;

    @Column(name = "metodo_pago", length = 50, nullable = false)
    private String metodoPago;

    @Column(name = "numero_seguimiento", length = 100, unique = true)
    private String numeroSeguimiento;

    @Column(name = "notas", columnDefinition = "TEXT")
    private String notas;

    public Pedido(Long id, LocalDate fechaPedido, LocalTime horaPedido, String estado, Float montoTotal, Long idCliente, String direccionEnvio, String ciudadEnvio, String metodoPago, String numeroSeguimiento, String notas) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.horaPedido = horaPedido;
        this.estado = estado;
        this.montoTotal = montoTotal;
        this.idCliente = idCliente;
        this.direccionEnvio = direccionEnvio;
        this.ciudadEnvio = ciudadEnvio;
        this.metodoPago = metodoPago;
        this.numeroSeguimiento = numeroSeguimiento;
        this.notas = notas;
    }

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalTime getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalTime horaPedido) {
        this.horaPedido = horaPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getCiudadEnvio() {
        return ciudadEnvio;
    }

    public void setCiudadEnvio(String ciudadEnvio) {
        this.ciudadEnvio = ciudadEnvio;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(String numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}