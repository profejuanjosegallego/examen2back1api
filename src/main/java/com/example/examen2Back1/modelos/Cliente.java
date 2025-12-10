package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(length = 150, nullable = false)
    private String nombreCompleto;
    @Column(length = 10, nullable = false)
    private String telefono;
    @Column(length = 150, nullable = false, unique = true)
    private String correo;
    @Column(nullable = false)
    private LocalDate fechaNacimiento;
    @Column(nullable = false)
    private String direccion;
    @Column(length = 150, nullable = false)
    private String pais;
    @Column(nullable = false)
    private Boolean esActivo;
    @Column(nullable = false)
    private String tipoDocumento;
    @Column(nullable = false)
    private String numeroDcumento;
    @Column(nullable = false)
    private String nombreUsuario;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nombreCompleto, String telefono, String correo, LocalDate fechaNacimiento, String direccion, String pais, Boolean esActivo, String tipoDocumento, String numeroDcumento, String nombreUsuario, Cliente cliente) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.pais = pais;
        this.esActivo = esActivo;
        this.tipoDocumento = tipoDocumento;
        this.numeroDcumento = numeroDcumento;
        this.nombreUsuario = nombreUsuario;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Boolean getEsActivo() {
        return esActivo;
    }

    public void setEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDcumento() {
        return numeroDcumento;
    }

    public void setNumeroDcumento(String numeroDcumento) {
        this.numeroDcumento = numeroDcumento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
