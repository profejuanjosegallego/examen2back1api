package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String apellido;

    @Column(length = 50, nullable = false)
    private String correo;

    @Column(length = 50, nullable = false)
    private Integer telefono;

    @Column(length = 50, nullable = false)
    private String cargo;

    @Column(length = 50, nullable = false)
    private Integer salario;

    @Column(length = 50, nullable = false)
    private LocalDate fechaIngreso;

    @Column(length = 50, nullable = false)
    private Integer documentoIdentidad;

    @Column(length = 50, nullable = false)
    private Boolean estado;

    public empleado() {
    }

    public empleado(Integer id, String nombre, String apellido, String correo, Integer telefono, String cargo, Integer salario, LocalDate fechaIngreso, Integer documentoIdentidad, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.documentoIdentidad = documentoIdentidad;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Integer documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
