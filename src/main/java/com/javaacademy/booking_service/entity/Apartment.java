package com.javaacademy.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Apartment apartment = (Apartment) o;
        return Objects.equals(id, apartment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
