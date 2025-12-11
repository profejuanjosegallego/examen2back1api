package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Order;
import com.example.examen2Back1.services.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/orders")
public class ControllerOrder {
    
    @Autowired
    private ServiceOrder serviceOrder;
    
    // POST Method

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceOrder.createOrder(data));
    }
    
    // GET Method

    @GetMapping
    public ResponseEntity<List<Order>> readOrder() {
        return ResponseEntity.ok(serviceOrder.readOrder());
    }
    
    // GET By ID Method
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> readOrderById(@PathVariable Integer id) {
        Optional<Optional<Order>> result = Optional.ofNullable(serviceOrder.getOrderById(id));
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    // PUT Method

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Integer id, @RequestBody Order data) {
        Order updated = serviceOrder.updateOrder(id, data);
        return (updated != null) ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
    
    // DELETE Method

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Integer id) {
        return serviceOrder.deleteOrder(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
