package com.example.examen2Back1.models;

import com.example.examen2Back1.models.Client;
import com.example.examen2Back1.models.Comic;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_orders")
public class Order {

    // Attributes

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String sendingAdress;

    @Column(nullable = false)
    private LocalDateTime dateOrder;

    @Column
    private String orderStatus;

    @Column
    private BigDecimal totalOrder;

    @Column
    private String paymentMethod;

    @Column
    private String clientNotes;

    @Column
    private BigDecimal shipmentCost;

    @Column
    private Boolean active;

    @Column
    private String followingNumber;

    @Column
    private String shipmentRoute;

    // Constructors

    public Order() {
    }

    public Order(String sendingAdress, LocalDateTime dateOrder, String orderStatus, BigDecimal totalOrder, String paymentMethod, String clientNotes, BigDecimal shipmentCost, Boolean active, String followingNumber, String shipmentRoute) {
        this.sendingAdress = sendingAdress;
        this.dateOrder = dateOrder;
        this.orderStatus = orderStatus;
        this.totalOrder = totalOrder;
        this.paymentMethod = paymentMethod;
        this.clientNotes = clientNotes;
        this.shipmentCost = shipmentCost;
        this.active = active;
        this.followingNumber = followingNumber;
        this.shipmentRoute = shipmentRoute;
    }

    // Relations

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "pedido_comic",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "comic_id")
    )
    private List<Comic> comic = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getSendingAdress() {
        return sendingAdress;
    }

    public void setSendingAdress(String sendingAdress) {
        this.sendingAdress = sendingAdress;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDateTime dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(BigDecimal totalOrder) {
        this.totalOrder = totalOrder;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String clientNotes) {
        this.clientNotes = clientNotes;
    }

    public BigDecimal getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(BigDecimal shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getFollowingNumber() {
        return followingNumber;
    }

    public void setFollowingNumber(String followingNumber) {
        this.followingNumber = followingNumber;
    }

    public String getShipmentRoute() {
        return shipmentRoute;
    }

    public void setShipmentRoute(String shipmentRoute) {
        this.shipmentRoute = shipmentRoute;
    }

    public Client getClient() {
        return client;
    }


    public List<Comic> getComics() {
        return comic;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", sendingAdress='" + sendingAdress + '\'' +
                ", dateOrder=" + dateOrder +
                ", orderStatus='" + orderStatus + '\'' +
                ", totalOrder=" + totalOrder +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", clientNotes='" + clientNotes + '\'' +
                ", shipmentCost=" + shipmentCost +
                ", active=" + active +
                ", followingNumber='" + followingNumber + '\'' +
                ", shipmentRoute='" + shipmentRoute + '\'' +
                ", client=" + client +
                ", comics=" + comic +
                '}';
    }
}
