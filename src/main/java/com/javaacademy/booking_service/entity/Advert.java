package com.javaacademy.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

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
    private String description;

    @ManyToOne
    @JoinColumn(name = "apartment_id", nullable = false)
    private Apartment apartment;

    @OneToMany(mappedBy = "advert")
    @ToString.Exclude
    private List<Booking> booking;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
            }
        Advert advert = (Advert) o;
        return Objects.equals(id, advert.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
