package com.example.examen2Back1.service;


import com.example.examen2Back1.model.Comic;
import com.example.examen2Back1.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;

@Service
public class ComicService {
    private final ComicRepository comicRepository;

    @Autowired
    public ComicService(ComicRepository comicRepository){this.comicRepository = comicRepository;}

    public Comic createComic(Comic comic) {
        if (!StringUtils.hasText(comic.getTitle())) {
            throw new IllegalArgumentException("Comic title must not be empty");
        }
        if (comic.getPrice() == null || BigDecimal.valueOf(comic.getPrice()).compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Comic price must be greater then 0");
        }
        if (comic.getStock() == null || comic.getStock() < 0) {
            throw new IllegalArgumentException("Comic stock must be non-negative");
        }
        return comicRepository.save(comic);
    }

}
