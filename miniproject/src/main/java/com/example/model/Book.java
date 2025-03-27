package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String author;
	private String isbn;
	private boolean available;
	
	
	public Book() {
		super();
	}

	public Book(String title, String author, String isbn, boolean available) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = available;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
