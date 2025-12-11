package com.example.examen2Back1.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Employee {

    // Attributes

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private LocalDate signingDate;

    @Column
    private String position;

    @Column
    private BigDecimal salary;

    @Column
    private LocalDate birthDate;

    @Column
    private String DNI;

    @Column
    private String likes;

    // Constructors

    public Employee() {
    }

    public Employee(String name, String lastName, String email, String phone, LocalDate signingDate, String position, BigDecimal salary, LocalDate birthDate, String DNI, String likes) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.signingDate = signingDate;
        this.position = position;
        this.salary = salary;
        this.birthDate = birthDate;
        this.DNI = DNI;
        this.likes = likes;
    }

    // Getters and Setter

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(LocalDate signingDate) {
        this.signingDate = signingDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", signingDate=" + signingDate +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                ", DNI='" + DNI + '\'' +
                ", likes='" + likes + '\'' +
                '}';
    }
}
