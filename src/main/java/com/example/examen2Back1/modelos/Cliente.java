package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @Column(length = 30, nullable = false)
    private String nombre;

    @Column (length = 30, nullable = false)
    private String apellido;

    @Column (length = 10, nullable = false)
    private String genero;

    @Column (length = 50, nullable = false)
    private String correoElectronico;

    @Column (length = 10, nullable = false)
    private String telefono;

    @Column (length = 50, nullable = false)
    private String direccion;

    @Column (nullable = false)
    private LocalDate fechaRegistro;

    @Column (nullable = false)
    private LocalDate fechaUltimaCompra;

    private boolean clienteActivo;

    @Column (nullable = false)
    private LocalDate fechaCumpleaños;

    public Cliente() {
    }

    public Cliente(Long id_cliente, String nombre, String apellido, String genero, String correoElectronico, String telefono,
                   String direccion, LocalDate fechaRegistro, LocalDate fechaUltimaCompra, boolean clienteActivo, LocalDate fechaCumpleaños) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaCompra = fechaUltimaCompra;
        this.clienteActivo = clienteActivo;
        this.fechaCumpleaños = fechaCumpleaños;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDate getFechaCumpleaños() {
        return fechaCumpleaños;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(LocalDate fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
    }

    public boolean isClienteActivo() {
        return clienteActivo;
    }

    public void setClienteActivo(boolean clienteActivo) {
        this.clienteActivo = clienteActivo;
    }
    public void setFechaCumpleaños(LocalDate fechaCumpleaños) {
        this.fechaCumpleaños = fechaCumpleaños;
    }
}
