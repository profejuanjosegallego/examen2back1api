package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Client;
import com.example.examen2Back1.services.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examenapi/v1/clients")
public class ControllerClient {



    @Autowired
    ServiceClient service;



    @PostMapping
    public ResponseEntity<Client> save(@RequestBody Client data){
        Client responseApi =this.service.saveClient(data);
        return ResponseEntity.status(HttpStatus.OK).body(responseApi);
    }
}
