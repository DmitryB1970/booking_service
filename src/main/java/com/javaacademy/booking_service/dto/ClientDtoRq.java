package com.javaacademy.booking_service.dto;


import lombok.Data;


@Data
public class ClientDtoRq {

    private Integer id = null;
    private String name;
    private String email;

}
