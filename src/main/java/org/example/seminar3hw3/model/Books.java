package org.example.seminar3hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
@Data
@AllArgsConstructor
public class Books {
    String title;
    String author;
    Double price;
    Integer editionYear;
    Integer pages;
}
