package com.javaacademy.booking_service.dto;

import com.javaacademy.booking_service.entity.ApartmentType;
import lombok.Data;

@Data
public class ApartmentDtoRq {

    private Integer id = null;
    private String city;
    private String street;
    private String house;
    private ApartmentType apartmentType = ApartmentType.ONLY_ROOM;

}
