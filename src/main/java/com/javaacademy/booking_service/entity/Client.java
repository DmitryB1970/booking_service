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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Booking> bookings;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}


