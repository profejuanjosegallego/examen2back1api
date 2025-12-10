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

    public Comic guadarComic(Comic comic){

        if (comic.getTitulo()== null ||  comic.getTitulo().equalsIgnoreCase("")){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Error al digitar el comic, el nombre no debe de estar vacio o nulo");
        }
        return repositorio.save(comic);
    }
}
