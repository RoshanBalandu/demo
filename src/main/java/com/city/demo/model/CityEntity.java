package com.city.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "City")
@Data

public class CityEntity {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private  String name;
    private int pin;
    private String country;




}
