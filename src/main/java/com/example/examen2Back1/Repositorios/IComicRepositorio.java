package com.example.examen2Back1.Repositorios;

import com.example.examen2Back1.modelos.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComicRepositorio extends JpaRepository <Comic, Integer> {
}
