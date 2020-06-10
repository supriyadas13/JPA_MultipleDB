package com.supriya.jpaswapping.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    
    public Book(){

        super();
        setBookId(UUID.randomUUID());
    }

    @Id
    private UUID bookId;

    private String bookName;

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }



}