package com.example.examen2Back1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICliente extends JpaRepository<ICliente, Integer> {
}
