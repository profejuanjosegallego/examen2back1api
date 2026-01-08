package com.example.examen2Back1.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name="empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;
    private String role;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;

    private LocalDate hiredAt;
    private LocalDate birthDate;

    private Boolean active;
    private Double salary;
}
