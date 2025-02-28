package com.javaacademy.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

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
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(nullable = false)
    private BigDecimal priceForNight;

    @Column(nullable = false)
    private Boolean status;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "apartment_id", nullable = false)
    private Apartment apartment;

    @OneToMany(mappedBy = "advert", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Booking> booking;
}
