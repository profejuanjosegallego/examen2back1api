package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table (name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreCompleto;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String telefono;

    private String direccion;

    private String ciudad;

    private LocalDate fechaNacimiento;

    @Column(nullable = false)
    private Boolean cuentaActiva;

    @Column(nullable = false)
    private LocalDateTime fechaRegistro;



    public Cliente() {
    }

    public Cliente(String nombreCompleto, String email, String password, String telefono, String direccion, String ciudad, LocalDate fechaNacimiento, Boolean cuentaActiva, LocalDateTime fechaRegistro, Cliente cliente) {

        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentaActiva = cuentaActiva;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getCuentaActiva() {
        return cuentaActiva;
    }

    public void setCuentaActiva(Boolean cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
