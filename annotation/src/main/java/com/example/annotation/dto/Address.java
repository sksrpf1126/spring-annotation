package com.example.annotation.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public class Address {
    private String city;
    private int street;

    @JsonCreator
    private Address(int street, String city) {
        this.city = "1";
        this.street = 2;
    }

    public Address(String city, int street) {
        this.city = "1";
        this.street = 2;
    }
}
