package com.example.examen2Back1.controllers;

import com.example.examen2Back1.model.Comic;
import com.example.examen2Back1.service.ComicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/comics")
public class ComicController {

    private final ComicService comicService;

    public ComicController(ComicService comicService){this.comicService = comicService;}

    @PostMapping
    public ResponseEntity<?> create (@RequestBody Comic comic){
        try{
            Comic saved = comicService.createComic(comic);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);
        } catch (IllegalArgumentException ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
