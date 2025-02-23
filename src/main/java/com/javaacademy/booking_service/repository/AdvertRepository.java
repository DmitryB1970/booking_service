package com.javaacademy.booking_service.repository;

import com.javaacademy.booking_service.entity.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertRepository extends JpaRepository<Advert, Integer> {
}
