package com.example.REST.controller;

import com.example.REST.Model.Book;
import com.example.REST.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> bookList= bookService.getBookList();
        if(bookList.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(bookList));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") int id){
        Book book=bookService.getBook(id);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/books/add")
    public ResponseEntity<Book> addBook(@RequestBody Book b){
        Book book=null;
        try{
            book=bookService.addBook(b);
            return ResponseEntity.of(Optional.of(book));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") int id){
        try{
            return ResponseEntity.ok(bookService.deleteBook(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no book found!!");
        }
    }

    @PutMapping("/books/update")
    public ResponseEntity<String> updateBook(@RequestBody Book book){
        return ResponseEntity.ok(bookService.updateBook(book));
    }

}
