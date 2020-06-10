package com.supriya.jpaswapping.controller;

import java.util.List;

import com.supriya.jpaswapping.entity.Book;
import com.supriya.jpaswapping.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BookController {
    
    public BookController() {
        super();
    }

    @Autowired
    BookRepository bookRepo;

    @GetMapping("/getBooks")
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }


    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book bookobj){
        bookRepo.save(bookobj);
        return bookobj;
    }


}