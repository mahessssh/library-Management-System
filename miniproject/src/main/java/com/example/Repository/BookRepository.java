package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
