package com.example.REST.service;

import com.example.REST.Model.Book;
import com.example.REST.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {


    @Autowired
    BookRepo bookRepo;
//    private static List<Book> bookList=new ArrayList<>();
//    static {
//        bookList.add(new Book(1,"java",4000));
//        bookList.add(new Book(2,"c",3500));
//        bookList.add(new Book(3,"c++",4500));
//    }
    public List<Book> getBookList(){
        return (List<Book>) bookRepo.findAll();
    }
    public Book getBook(int id){
       return bookRepo.findById(id);
    }
    public Book addBook(Book b){
       Book book= bookRepo.save(b);
       return book;
    }

    public String deleteBook(int id) {
        Book book=bookRepo.findById(id);
        if(book==null){
            return "no data found!";
        }
        bookRepo.deleteById(id);
        return "deleted";
    }

    public String updateBook(Book book) {
//        boolean flag=false;
//        for(int i=0;i<bookList.size();i++){
//            if(book.getId()==bookList.get(i).getId()){
//                flag=true;
//                Book b=bookList.get(i);
//                b.setPrice(book.getPrice());
//                b.setTitle(book.getTitle());
//            }
//        }
//        if(flag){
//            return "updated";
//        }else{
//            addBook(book);
//            return "book not found adding into data...";
//        }
        Book book1=bookRepo.findById(book.getId());
        if(book1!=null){
            book1.setTitle(book.getTitle());
            book1.setPrice(book.getPrice());
            bookRepo.save(book1);
            return "updated";
        }else{
            bookRepo.save(book);
            return "book not found adding into data...";
        }
    }
}
