package com.baeldung.h2.h2course.services;


import com.baeldung.h2.h2course.models.Book;
import com.baeldung.h2.h2course.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
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

    public void saveAndFlush(Book book){
        bookRepository.saveAndFlush(book);
    }
}
