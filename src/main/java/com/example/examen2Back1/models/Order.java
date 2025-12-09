package com.example.examen2Back1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime orderNumber;

    @Column(nullable = false)
    private LocalDateTime orderDate;

    @Column(nullable = false)
    private BigDecimal totalAmount;

    @Column(length = 20, nullable = false)
    private String status;

    @Column(length = 50, nullable = false)
    private String paymentMethod;

    @Column(length = 20, nullable = false)
    private String paymentStatus;

    @Column(length = 100, nullable = false)
    private String shippingAddress;

    @Column(nullable = false)
    private BigDecimal shippingCost;

    @Column(length = 50)
    private String trackingNumber;

    @Column(length = 200)
    private String comments;


}
