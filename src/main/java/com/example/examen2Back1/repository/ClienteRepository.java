package com.example.examen2Back1.repository;

import com.example.examen2Back1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
