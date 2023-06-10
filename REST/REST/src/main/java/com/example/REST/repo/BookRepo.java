package com.example.REST.repo;

import com.example.REST.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Integer> {
    public Book findById(int id);
}
