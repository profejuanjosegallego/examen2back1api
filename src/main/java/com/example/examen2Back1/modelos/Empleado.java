package com.example.examen2Back1.modelos;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empleado_id ;

    @Column(length = 65, nullable = false)
    private String nombre;

    @Column(length = 65, nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String puesto;

    @Column(nullable = false)
    private String departamento;

    @Column(length = 8, nullable = false)
    private LocalDate fechaContratacion;

    @Column(nullable = false)
    private Double salario;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Boolean estadoActivo;

    @Column (nullable = false)
    private LocalDate fechaNacimiento;

    public Empleado() {
    }

    public Empleado(Long empleado_id, String nombre, String apellido, String puesto, String departamento, LocalDate fechaContratacion, Double salario, String telefono, String email, Boolean estadoActivo, LocalDate fechaNacimiento) {
        this.empleado_id = empleado_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.departamento = departamento;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.telefono = telefono;
        this.email = email;
        this.estadoActivo = estadoActivo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(Long empleado_id) {
        this.empleado_id = empleado_id;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
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

    public Boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(Boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
