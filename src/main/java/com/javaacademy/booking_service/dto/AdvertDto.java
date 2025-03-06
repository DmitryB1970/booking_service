package com.javaacademy.booking_service.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Builder
@Data
public class AdvertDto {

    private Integer id;
    private BigDecimal priceForNight;
    private Boolean status;
    private ApartmentDto apartmentDto;
    private String description;
    private List<Integer> bookingsIds;
}
