package com.example.examen2Back1.repositories;

import com.example.examen2Back1.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployee extends JpaRepository <Employee, Integer> {
}
