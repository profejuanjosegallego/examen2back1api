package com.example.examen2Back1.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idPedido;

    @Column(nullable = false)
    private LocalDate fechaPedido;
    @Column(nullable = false)
    private String estadoPedido;
    @Column(nullable = false)
    private String metododepago;
    @Column(nullable = false)
    private Double totalSinIva;
    @Column(nullable = false)
    private Long idCliente;
    @Column(nullable = false)
    private Double costoEnvio;
    @Column(nullable = false)
    private String direccionEnvio;
    @Column(nullable = false)
    private Double impuesto;
    @Column(nullable = false)
    private Float peso;
    @Column(nullable = false)
    private Double totalIva;

}
