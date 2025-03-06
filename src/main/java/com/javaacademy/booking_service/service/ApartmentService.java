package com.javaacademy.booking_service.service;

import com.javaacademy.booking_service.dto.ApartmentDtoRq;
import com.javaacademy.booking_service.entity.Apartment;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {

    public Apartment createNewApartment(ApartmentDtoRq apartmentDtoRq) {
        return Apartment.builder()
                .id(apartmentDtoRq.getId())
                .city(apartmentDtoRq.getCity())
                .street(apartmentDtoRq.getStreet())
                .house(apartmentDtoRq.getHouse())
                .apartmentType(apartmentDtoRq.getApartmentType())
                .build();
    }
}
