package com.javaacademy.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@SuppressWarnings("checkstyle:RegexpSingleline")
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String house;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ApartmentType apartmentType;

    @OneToMany(mappedBy = "apartment", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Advert> adverts;
}
