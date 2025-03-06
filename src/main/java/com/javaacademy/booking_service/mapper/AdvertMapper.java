package com.javaacademy.booking_service.mapper;

import com.javaacademy.booking_service.dto.AdvertDto;
import com.javaacademy.booking_service.entity.Advert;
import com.javaacademy.booking_service.entity.Apartment;
import com.javaacademy.booking_service.entity.Booking;
import com.javaacademy.booking_service.repository.ApartmentRepository;
import com.javaacademy.booking_service.repository.BookingRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public abstract class AdvertMapper {

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "apartment", source = "id", qualifiedByName = "getApartment")
    @Mapping(target = "bookings", source = "bookingsIds", qualifiedByName = "getBookingsByIds")
    public abstract Advert toEntityWithRelation(AdvertDto dto);

    @Named("getApartment")
    public Apartment getApartment(Integer id) {
        return apartmentRepository.findById(id).orElseThrow();
    }

    @Named("getBookingsByIds")
    public List<Booking> getBookingsByIds(List<Integer> bookingsIds) {
        return bookingRepository.findAllById(bookingsIds);
    }
}
