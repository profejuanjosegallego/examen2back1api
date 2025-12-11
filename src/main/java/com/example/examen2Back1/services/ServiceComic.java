package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Comic;
import com.example.examen2Back1.repositories.IComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceComic {


    @Autowired
    IComicRepository repository;

    public Comic saveComic(Comic dataComic){
        return this.repository.save(dataComic);
    }
}
