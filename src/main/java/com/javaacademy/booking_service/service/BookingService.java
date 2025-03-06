package com.javaacademy.booking_service.service;

import com.javaacademy.booking_service.dto.BookingDtoRq;
import com.javaacademy.booking_service.entity.Booking;
import com.javaacademy.booking_service.repository.AdvertRepository;
import com.javaacademy.booking_service.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {

    private ClientRepository clientRepository;
    private AdvertRepository advertRepository;

    public Booking createNewBooking(BookingDtoRq bookingDtoRq) {
        return Booking.builder()
                .id(bookingDtoRq.getId())
                .client(clientRepository.findById(bookingDtoRq.getId()).orElseThrow())
                .advert(advertRepository.findById(bookingDtoRq.getId()).orElseThrow())
                .build();
    }
}
