package com.example.examen2Back1.repositories;

import com.example.examen2Back1.models.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComicRepository extends JpaRepository<Comic, Integer> {
}
