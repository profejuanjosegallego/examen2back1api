package com.example.examen2Back1.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name="comics")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private String series;
    private String publisher;
    private String writer;
    private String artist;
    private String language;
    private String coverType;
    private String isbn;

    private Integer serialNumber;
    private Integer stock;

    @Column(length = 2000)
    private String description;

    private LocalDate releaseDate;
    private Double price;



}
