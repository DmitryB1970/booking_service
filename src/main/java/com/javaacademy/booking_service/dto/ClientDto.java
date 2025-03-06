package com.javaacademy.booking_service.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;
    private String name;
    private String email;
    private List<BookingDto> bookingDtos;
}

