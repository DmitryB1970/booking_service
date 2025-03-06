package com.javaacademy.booking_service.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class BookingDtoRq {

    private Integer id =  null;
    private Integer clientId = 0;
    private Integer advertId = 0;
    @SuppressWarnings("checkstyle:MagicNumber")
    private LocalDate dateStart = LocalDate.of(2025, 2, 13);
    @SuppressWarnings({"checkstyle:MagicNumber", "checkstyle:WhitespaceAfter"})
    private LocalDate dateFinish = LocalDate.of(2025, 2,13);
}
