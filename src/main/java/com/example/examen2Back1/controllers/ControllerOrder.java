package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Order;
import com.example.examen2Back1.services.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comicapi/v1/orders")
public class ControllerOrder {

    @Autowired
    ServiceOrder service;

    @PostMapping
    public ResponseEntity <Order> save(@RequestBody Order data) {
        Order responseApi = this.service.saveOrder(data);
        return ResponseEntity.status(HttpStatus.OK).body(responseApi);
    }
}
