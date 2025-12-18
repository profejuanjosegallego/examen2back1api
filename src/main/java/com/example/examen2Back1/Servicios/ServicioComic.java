package com.example.examen2Back1.Servicios;

import com.example.examen2Back1.Repositorios.IComicRepositorio;
import com.example.examen2Back1.modelos.Comic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServicioComic {
    @Autowired
    private IComicRepositorio repositorio;

    public Comic guardarcomic (Comic datoscomic) {

        //Validar que titulo no esté vacío:
        if (datoscomic.getTitulo()==null || datoscomic.getTitulo().length()<4) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "El titulo ingresado no cumple con los requisitos establecidos"
            );
        }
        return this.repositorio.save(datoscomic);
    }

    public List<Comic> buscarTodos() {
        return this.repositorio.findAll();
    }
}
