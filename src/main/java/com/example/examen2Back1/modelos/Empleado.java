package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEmpleado;

    @Column(nullable=false)
    private String nombreCompleto;
    private String direccion;
    @Column(nullable=false)
    private LocalDate fechaIngreso;
    @Column(nullable=false)
    private String tipoDocumento;
    @Column(nullable=false, unique=true)
    private String numeroDocumento;
    private String cargo;
    @Column(nullable=false, unique=true)
    private String correo;
    private String telefono;
    @Column(nullable=false)
    private String area;

    public Empleado() {
    }

    public Empleado(Long idEmpleado, String nombreCompleto, String direccion, LocalDate fechaIngreso, String tipoDocumento, String numeroDocumento, String cargo, String correo, String telefono, String area) {
        this.idEmpleado = idEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.fechaIngreso = fechaIngreso;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.cargo = cargo;
        this.correo = correo;
        this.telefono = telefono;
        this.area = area;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
