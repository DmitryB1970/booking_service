package com.javaacademy.booking_service.mapper;

import com.javaacademy.booking_service.dto.ClientDto;
import com.javaacademy.booking_service.entity.Client;
import org.mapstruct.Mapper;

@Mapper
public abstract class ClientMapper {

    public abstract Client toEntityWithRelation(ClientDto clientDto);
}
