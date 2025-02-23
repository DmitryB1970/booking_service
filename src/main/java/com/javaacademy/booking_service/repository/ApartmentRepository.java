package com.javaacademy.booking_service.repository;

import com.javaacademy.booking_service.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
}
