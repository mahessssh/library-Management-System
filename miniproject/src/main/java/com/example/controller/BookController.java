package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.service.BookService;

@RestController
@RequestMapping("/Books")
public class BookController {
    @Autowired
	private BookService bookservice;
	
	@GetMapping()
	public String listBooks(Model model) {
		model.addAttribute("books", bookservice.getAllBooks());
		return "books";
    }
	@GetMapping("/add")
	public String showAddBookFrom(Model model) {
		model.addAttribute("book", new Book());
		return "add-book";
	}
	
	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book")Book book) {
		bookservice.saveBook(book);
		return "redirect:/books";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBook(@PathVariable Integer id) {
		bookservice.deleteBook(id);
		return "redirect:/books";
	}
}
