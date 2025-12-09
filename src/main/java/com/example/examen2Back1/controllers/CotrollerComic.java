package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Comic;
import com.example.examen2Back1.services.ServiceComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comic")
public class CotrollerComic {
    @Autowired
    ServiceComic serviceComic;

    @PostMapping
    public ResponseEntity<Comic> savePedido(@RequestBody Comic datosComic) {
        return ResponseEntity.ok().body(serviceComic.saveComic(datosComic));
    }
}
