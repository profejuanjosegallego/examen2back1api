package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

@Entity
@Table
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(length = 50, nullable = false)
    private String nombreCompleto;
    @Column(length = 50, nullable = false)
    private String documentoIdentidad;
    @Column(length = 50, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private String correo;
    @Column(length = 50, nullable = false)
    private String direccion;
    @Column(length = 50,nullable = false)
    private String ciudad;
    @Column(length = 50,nullable = false)
    private String fechaRegistro;
    @Column(length = 50, nullable = false)
    private String tipoCliente;
    @Column(length = 50, nullable = false)
    private boolean activo;


    public Cliente(){
    }

    public Cliente(int idCliente, boolean activo, String tipoCliente, String fechaRegistro, String ciudad, String direccion, String correo, String telefono, String documentoIdentidad, String nombreCompleto) {
        this.idCliente = idCliente;
        this.activo = activo;
        this.tipoCliente = tipoCliente;
        this.fechaRegistro = fechaRegistro;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.documentoIdentidad = documentoIdentidad;
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
