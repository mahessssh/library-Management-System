package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.BookRepository;
import com.example.model.Book;

@Service
public class BookService {
    @Autowired
	private BookRepository bookrepository;
    
    public List<Book> getAllBooks(){
    	return bookrepository.findAll();
    }
    
    public Book getBookById(Integer id) {
    	return bookrepository.findById(id).orElse(null);
    			
    }
    
    public void saveBook(Book book) {
    	bookrepository.save(book);
    }
    
    public void deleteBook(Integer id) {
    	bookrepository.deleteById(id);
    }
}
