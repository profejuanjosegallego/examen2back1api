package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Comic;
import com.example.examen2Back1.repositorios.IComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioComic {

    @Autowired
    private IComic repositorio;

    public Comic guardarComic(Comic comic) {
        if (comic.getPrecio() == null || comic.getPrecio() <= 0) {
            throw new IllegalArgumentException("El precio del comic debe ser mayor a 0");
        }
        return repositorio.save(comic);
    }
}
