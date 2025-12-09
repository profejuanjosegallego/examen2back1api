package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Employee;
import com.example.examen2Back1.services.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comicapi/v1/employees")
public class ControllerEmployee {

    @Autowired
    ServiceEmployee service;

    @PostMapping
    public ResponseEntity <Employee> save (@RequestBody Employee data) {
        Employee responseApi = this.service.saveEmployee(data);
        return ResponseEntity.status(HttpStatus.OK).body(responseApi);
    }
}
