package com.example.examen2Back1.Controladores;

import com.example.examen2Back1.Servicios.ServicioComic;
import com.example.examen2Back1.modelos.Comic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comics")
public class ControladorComic {
    private final ServicioComic servicio;

    public ControladorComic(ServicioComic servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public ResponseEntity<Comic>guardar(@RequestBody Comic datos){
        Comic respuestaDeApi=this.servicio.guardarcomic(datos);
        return ResponseEntity.status(HttpStatus.OK).body(respuestaDeApi);
    }

    @GetMapping
    public ResponseEntity<List<Comic>> buscarTodos() {
        List<Comic> comics = this.servicio.buscarTodos();
        return ResponseEntity.ok(comics);
    }
}
