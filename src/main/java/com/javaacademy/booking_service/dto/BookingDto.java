package com.javaacademy.booking_service.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
public class BookingDto {

    private Integer id;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal totalSum;
    private ClientDto clientDto;
    private AdvertDto advertDto;
}
