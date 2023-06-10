package com.example.REST.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Author {
    @Id
    private int authId;
    private String  name;
    @OneToOne(mappedBy = "author")
    @JsonBackReference
    private Book book;
}
