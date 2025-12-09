package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Customer;
import com.example.examen2Back1.services.ServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/comicapi/v1/customers")
public class ControllerCustomer {

    @Autowired
    ServiceCustomer service;

    @PostMapping
    public ResponseEntity <Customer> save (@RequestBody Customer data) {
        Customer responseApi = this.service.saveCustomer(data);
        return ResponseEntity.status(HttpStatus.OK).body(responseApi);
    }
}
