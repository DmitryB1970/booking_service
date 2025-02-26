package com.javaacademy.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private BigDecimal priceForNight;

    @Column(nullable = false)
    private Boolean status;

    @Column(nullable = false)
    private Integer apartmentId;

    @Column(nullable = false)
    private String description;
}
