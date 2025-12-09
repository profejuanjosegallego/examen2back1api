package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Comic;
import com.example.examen2Back1.services.ServiceComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/comicapi/v1/comics")
public class ControllerComic {

    @Autowired
    ServiceComic service;

    @PostMapping
    public ResponseEntity <Comic> save (@RequestBody Comic data) {
        Comic responseApi = this.service.saveComic(data);
        return  ResponseEntity.status(HttpStatus.OK).body(responseApi);
    }
}
