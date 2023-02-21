package org.example.seminar3hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
@Data
@AllArgsConstructor
public class Commodities {
    String name;
    String country;
    Double weight;
    Double price;
    String sort;
}