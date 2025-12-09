package com.example.examen2Back1.repositories;

import com.example.examen2Back1.models.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComic extends JpaRepository<Comic, Integer> {
}
