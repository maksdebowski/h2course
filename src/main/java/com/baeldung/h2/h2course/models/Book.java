package com.baeldung.h2.h2course.models;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    Set<Student> likes;

    public Book() {
    }

    public Book(Long id, String name, Set<Student> likes) {
        this.id = id;
        this.name = name;
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getLikes() {
        return likes;
    }

    public void setLikes(Set<Student> likes) {
        this.likes = likes;
    }
}



