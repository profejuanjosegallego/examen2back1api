package com.example.examen2Back1.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name="Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (length = 50, nullable = false)
    private String firstName;

    @Column (length = 50, nullable = false)
    private String lastName;

    @Column (nullable = false)
    private LocalDate birthDate;

    @Column (length = 20, nullable = false)
    private String gender;

    @Column (length = 50, nullable = false)
    private String country;

    @Column (length = 50, nullable = false)
    private String city;

    @Column (length = 20, nullable = false)
    private String profession;

    @Column (length = 50, nullable = false)
    private String maritalStatus;

    @Column (length = 50, nullable = false)
    private String adress;

    @Column (length = 50, nullable = false)
    private String phoneNumber;


    public Employee(Integer id, String name, String lastName, LocalDate birthDate, String gender, String country, String city, String profession, String maritalStatus, String adress, String phoneNumber) {
        this.id = id;
        this.firstName = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.country = country;
        this.city = city;
        this.profession = profession;
        this.maritalStatus = maritalStatus;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }
}
