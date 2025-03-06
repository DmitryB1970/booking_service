package com.javaacademy.booking_service.dto;

import com.javaacademy.booking_service.entity.ApartmentType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ApartmentDto {

    private Integer id;
    private String city;
    private String street;
    private String house;
    private ApartmentType apartmentType;
    private List<AdvertDto> dtos;
}
