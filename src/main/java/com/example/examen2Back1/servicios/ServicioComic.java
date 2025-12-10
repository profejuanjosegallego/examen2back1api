package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Comic;
import com.example.examen2Back1.repositorios.IComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
@Service
public class ServicioComic {
    @Autowired
    private IComic repositorio;

    public Comic guardarComic(Comic datosComic){
        if (datosComic.getNombreComic() == null || datosComic.getNombreComic() == ""){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "El nombre del comic no cumple los requisitos 😒❌");

        }

        return this.repositorio.save(datosComic);

    }
}
