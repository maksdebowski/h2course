package com.baeldung.h2.h2course.controller;


import com.baeldung.h2.h2course.models.Book;
import com.baeldung.h2.h2course.services.BookService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody Book book){
        bookService.add(book);
    }

    @GetMapping
    public void findAll(){
        bookService.list();
    }

    @PostMapping(value = "/flush", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveAndFlush(@RequestBody Book book){
        bookService.saveAndFlush(book);
    }
}
