package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Order;
import com.example.examen2Back1.repositories.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceOrder {

    @Autowired
    private IOrderRepository orderRepository;

    // Create Method

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Read Method

    public List<Order> readOrder() {
        return orderRepository.findAll();
    }

    // Read by ID Method
    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }

    // Update Method

    public Order updateOrder(Integer id, Order updatedOrder) {
        Optional<Order> optionalBranch = orderRepository.findById(id);

        if (optionalBranch.isPresent()) {
            Order existing = optionalBranch.get();
            existing.setDateOrder(existing.getDateOrder());
            existing.setActive(existing.getActive());
            existing.setOrderStatus(existing.getOrderStatus());
            existing.setTotalOrder(existing.getTotalOrder());
            existing.setClientNotes(existing.getClientNotes());
            existing.setFollowingNumber(existing.getFollowingNumber());
            existing.setPaymentMethod(existing.getPaymentMethod());
            existing.setSendingAdress(existing.getSendingAdress());
            existing.setShipmentCost(existing.getShipmentCost());
            existing.setShipmentRoute(existing.getShipmentRoute());
            return orderRepository.save(existing);
        }
        return null;
    }

    // Delete Method

    public boolean deleteOrder(Integer id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
