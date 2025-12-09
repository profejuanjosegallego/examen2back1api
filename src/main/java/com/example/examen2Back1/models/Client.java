package com.example.examen2Back1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nombreCliente;

    @Column(length = 20, nullable = false)
    private String tipoDocumento;

    @Column(length = 20, nullable = false)
    private String numeroDocumneto;

    @Column(length = 10, nullable = false)
    private String telefono;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50)
    private String direccion;

    @Column(length = 50)
    private String ciudad;

    @Column(length = 20)
    private String genero;

    @Column(length = 50)
    private String tipoCliente;

    @Column(length = 10)
    private String codigoPostal;

    public Client() {
    }

    public Client(Integer id, String nombreCliente, String tipoDocumento, String numeroDocumneto, String telefono, String email, String direccion, String ciudad, String genero, String tipoCliente, String codigoPostal) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumneto = numeroDocumneto;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.genero = genero;
        this.tipoCliente = tipoCliente;
        this.codigoPostal = codigoPostal;
    }

    @OneToOne(mappedBy = "client", fetch = FetchType.LAZY)
    private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumneto() {
        return numeroDocumneto;
    }

    public void setNumeroDocumneto(String numeroDocumneto) {
        this.numeroDocumneto = numeroDocumneto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
