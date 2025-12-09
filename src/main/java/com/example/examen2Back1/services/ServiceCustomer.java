package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Customer;
import com.example.examen2Back1.repositories.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCustomer {

    @Autowired
    private ICustomer reposity;

    public Customer saveCustomer (Customer dataCustomer) {

        return this.reposity.save(dataCustomer);
    }
}
