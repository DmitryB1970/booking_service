package com.javaacademy.booking_service.service;

import com.javaacademy.booking_service.dto.ClientDtoRq;
import com.javaacademy.booking_service.entity.Client;
import com.javaacademy.booking_service.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private ClientRepository clientRepository;

    public Client createNewClient(ClientDtoRq clientDtoRq) {
       return  Client.builder()
               .id(clientDtoRq.getId())
                .name(clientDtoRq.getName())
                .email(clientDtoRq.getEmail())
                .build();
    }
}
