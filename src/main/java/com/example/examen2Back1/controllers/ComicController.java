package com.example.examen2Back1.controllers;

import com.example.examen2Back1.modelos.comic;
import com.example.examen2Back1.repositorios.Icomic;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comics")
public class ComicController {

    private final Icomic repo;

    public ComicController(Icomic repo) {
        this.repo = repo;
    }

    @PostMapping
    public comic crear(@RequestBody comic comic) {
        return repo.save(comic);
    }
}
