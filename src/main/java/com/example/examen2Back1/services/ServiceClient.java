package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Client;
import com.example.examen2Back1.repositories.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServiceClient {

    @Autowired
    private IClientRepository repository;

    public Client saveClient(Client dataClient){

        if(dataClient.getNombreCliente() == null || dataClient.getNombreCliente().length() <= 2){
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Name is too short and can't be validated"
            );
        }


        return this.repository.save(dataClient);
    }
}
