package com.example.examen2Back1.service;

import com.example.examen2Back1.model.Cliente;
import com.example.examen2Back1.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){this.clienteRepository = clienteRepository;}
    public Cliente createCliente (Cliente cliente) {
        if (!StringUtils.hasText(cliente.getFirstName()) || !StringUtils.hasText(cliente.getLastName())) {
            throw new IllegalArgumentException("Cliente must have first and last name");
        }
        if (!StringUtils.hasText(cliente.getEmail())) {
            throw new IllegalArgumentException("Cliente email must not be empty");
        }
        return clienteRepository.save(cliente);
    }
}
