package com.example.examen2Back1.repositorios;

import com.example.examen2Back1.modelos.pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ipedido extends JpaRepository <pedido, Integer> {
}
