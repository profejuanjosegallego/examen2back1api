package com.example.examen2Back1.controladores;

import com.example.examen2Back1.modelos.Comic;
import com.example.examen2Back1.servicios.ServicioComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("POST /api/comics")
public class ControladorComic {
    @Autowired
    ServicioComic servicioComic;
    @PostMapping
    public ResponseEntity<Comic> guardar(@RequestBody Comic moneda){
      Comic respuestaDelApi=this.servicioComic.guardarComic(moneda);
      return ResponseEntity.status(HttpStatus.OK).body(respuestaDelApi);
    }
}
