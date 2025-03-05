package com.ezzahi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Adresse {
    private String zipCode;
    private String street;
    private String city;
}
