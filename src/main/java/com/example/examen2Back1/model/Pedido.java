package com.example.examen2Back1.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name="pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer clienteID;
    private Integer pedidoID;

    private LocalDate orderDate;

    private Double totalAmount;

    private String status;
    private String shippingAddres;
    private String billingAddress;
    private String paymentMethod;
    private String trackingNumber;
    private String notes;

    private Integer itemsCount;
}
