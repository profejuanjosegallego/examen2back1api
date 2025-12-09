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
    private IComic iComic;

    public Comic guardarComic(Comic monedaComic) {
        if (monedaComic.getMoneda() == null || monedaComic.getMoneda() == "" || monedaComic.getMoneda().length() < 1) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT, "Ingrese un tipo de moneda valido"
            );
        }
        return this.iComic.save(monedaComic);
    }
}
