package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Comic;
import com.example.examen2Back1.repositories.IComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServiceComic {
    @Autowired
    private IComic repositorio;

    public Comic saveComic(Comic comic) {

        if(comic.getTitulo() == null || comic.getTitulo().equalsIgnoreCase("")){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Error al digital el comic, el nombre no debe estar vacio o ser nulo");
        }

        return repositorio.save(comic);
    }
}
