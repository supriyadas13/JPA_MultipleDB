package com.supriya.jpaswapping.repository;

import java.util.UUID;

import com.supriya.jpaswapping.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, UUID> {
    
}