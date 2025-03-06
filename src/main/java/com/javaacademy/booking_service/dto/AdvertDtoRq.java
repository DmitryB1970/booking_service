package com.javaacademy.booking_service.dto;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class AdvertDtoRq {

    private Integer id = null;
    private BigDecimal price = BigDecimal.ZERO;
    private Boolean isActive = true;
    private Integer apartmentId = 0;
    private String description;

}
