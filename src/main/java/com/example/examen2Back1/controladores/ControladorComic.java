package com.example.examen2Back1.controladores;

import com.example.examen2Back1.modelos.Comic;
import com.example.examen2Back1.servicios.ServicioComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comic")
public class ControladorComic {
    @Autowired
    ServicioComic servicioComic;

    @PostMapping
    public ResponseEntity<Comic> guardarComic(@RequestBody Comic datosComic){
        return ResponseEntity.ok().body(servicioComic.guadarComic(datosComic));
    }
}
