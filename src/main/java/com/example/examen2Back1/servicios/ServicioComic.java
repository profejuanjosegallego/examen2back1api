package com.example.examen2Back1.servicios;

import com.example.examen2Back1.modelos.Comic;
import com.example.examen2Back1.repositorios.IComic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;

@Service
public class ServicioComic {

    @Autowired
    private IComic rComic;

    public Comic guardarComic(Comic precioComic){
        if(precioComic.getPrecio()==null||precioComic.getPrecio().compareTo(BigDecimal.ZERO)<0){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "El precio del producto es invalido");
        }
        return this.rComic.save(precioComic);
    }

}
