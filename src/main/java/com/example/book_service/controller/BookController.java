package com.example.book_service.controller;

import com.example.book_service.dao.BookRepository;
import com.example.book_service.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookRepository repo;

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return repo.saveAndFlush(book);
    }
    @GetMapping("/books/{bid}")
    public Book getABook(@PathVariable int bid){
       return repo.findById(bid).get();
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return repo.findAll();
    }
}
