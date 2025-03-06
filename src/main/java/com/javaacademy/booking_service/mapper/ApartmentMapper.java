package com.javaacademy.booking_service.mapper;


import com.javaacademy.booking_service.dto.ApartmentDto;
import com.javaacademy.booking_service.entity.Apartment;
import org.mapstruct.Mapper;

@Mapper
public abstract class ApartmentMapper {

    public abstract Apartment oEntityWithRelation(ApartmentDto aapartmentDto);
}
