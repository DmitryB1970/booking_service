package com.javaacademy.booking_service.mapper;

import com.javaacademy.booking_service.dto.BookingDto;
import com.javaacademy.booking_service.entity.Booking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {AdvertMapper.class, ClientMapper.class})
public abstract class BookingMapper {

    @Mapping(target = "advert", source = "advertDto")
    @Mapping(target = "client", source = "clientDto")
    public abstract Booking toEntityWithRelation(BookingDto dto);
}
