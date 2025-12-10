package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

@Entity
@Table
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    @Column(length = 50, nullable = false)
    private String nombreCompleto;
    @Column(length = 50, nullable = false)
    private String cargo;
    @Column(length = 50, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private String correo;
    @Column(length = 50, nullable = false)
    private String direccion;
    @Column(length = 50, nullable = false)
    private double salario;
    @Column(length = 50, nullable = false)
    private String fechaContratacion;
    @Column(length = 50, nullable = false)
    private String turno;
    @Column(length = 50, nullable = false)
    private boolean activo;

    public Empleado(){
    }

    public Empleado(int idEmpleado, boolean activo, String turno, String fechaContratacion, double salario, String direccion, String correo, String telefono, String cargo, String nombreCompleto) {
        this.idEmpleado = idEmpleado;
        this.activo = activo;
        this.turno = turno;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
