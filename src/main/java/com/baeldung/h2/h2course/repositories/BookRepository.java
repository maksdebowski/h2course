package com.baeldung.h2.h2course.repositories;

import com.baeldung.h2.h2course.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book, Long>, CrudRepository<Book, Long> {

}
