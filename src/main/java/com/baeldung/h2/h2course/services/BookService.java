package com.baeldung.h2.h2course.services;


import com.baeldung.h2.h2course.models.Book;
import com.baeldung.h2.h2course.repositories.BookRepository;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list(){
        return bookRepository.findAll();
    }

    public void add(Book book){
        bookRepository.save(book);
    }
}
