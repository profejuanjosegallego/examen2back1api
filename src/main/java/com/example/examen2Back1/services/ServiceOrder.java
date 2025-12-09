package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Order;
import com.example.examen2Back1.repositories.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOrder {

    @Autowired
    private IOrder repository;

    public Order saveOrder (Order dataOrder) {

        return this.repository.save(dataOrder);
    }
}
