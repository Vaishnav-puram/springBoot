package com.example.REST.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
public class Book {
    @Id
    private int id;
    private String title;
    private int price;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Author author;
}
