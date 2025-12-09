package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Employee;
import com.example.examen2Back1.repositories.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEmployee {

    @Autowired
    private IEmployee repository;

    public Employee saveEmployee (Employee dataEmployee) {

        return this.repository.save(dataEmployee);
    }
}
