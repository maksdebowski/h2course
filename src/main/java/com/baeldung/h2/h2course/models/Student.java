package com.baeldung.h2.h2course.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Student {

    @Id
    Long id;

    @ManyToMany
    Set<Book> likedBooks;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Book> getLikedBooks() {
        return likedBooks;
    }

    public void setLikedBooks(Set<Book> likedBooks) {
        this.likedBooks = likedBooks;
    }

    public Student(Long id, Set<Book> likedBooks) {
        this.id = id;
        this.likedBooks = likedBooks;
    }
}
