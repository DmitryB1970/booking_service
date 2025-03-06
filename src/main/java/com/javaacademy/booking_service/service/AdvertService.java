package com.javaacademy.booking_service.service;

import com.javaacademy.booking_service.dto.AdvertDto;
import com.javaacademy.booking_service.dto.AdvertDtoRq;
import com.javaacademy.booking_service.dto.ApartmentDto;
import com.javaacademy.booking_service.dto.ApartmentDtoRq;
import com.javaacademy.booking_service.entity.Advert;
import com.javaacademy.booking_service.repository.AdvertRepository;
import com.javaacademy.booking_service.repository.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdvertService {

    private final ApartmentRepository apartmentRepository;
    private final AdvertRepository advertRepository;

    public Advert createNewAdvert(AdvertDtoRq advertDtoRq) {
        return Advert.builder()
                .id(advertDtoRq.getId())
                .priceForNight(advertDtoRq.getPrice())
                .status(advertDtoRq.getIsActive())
                .description(advertDtoRq.getDescription())
                .apartment(apartmentRepository.findById(advertDtoRq.getApartmentId()).orElseThrow())
                .build();
    }

    public Advert save(Advert advert) {
        return advertRepository.save(advert);
    }

    private ApartmentDto apartmentDto(ApartmentDtoRq apartmentDtoRq) {
        return ApartmentDto.builder()
                .id(apartmentDtoRq.getId())
                .city(apartmentDtoRq.getCity())
                .street(apartmentDtoRq.getStreet())
                .house(apartmentDtoRq.getHouse())
                .apartmentType(apartmentDtoRq.getApartmentType())
                .build();
    }

    public AdvertDto toDto(AdvertDtoRq advertDtoRq, ApartmentDtoRq apartmentDtoRq) {
        return AdvertDto.builder()
                .id(advertDtoRq.getId())
                .priceForNight(advertDtoRq.getPrice())
                .status(advertDtoRq.getIsActive())
                .apartmentDto(apartmentDto(apartmentDtoRq))
                .build();
    }
}