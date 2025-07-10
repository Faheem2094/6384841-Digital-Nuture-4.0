package com.library.service;

import com.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;
    private String libraryName;

    // Constructor Injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Welcome to " + libraryName + " Library!");
        List<String> books = bookRepository.getAllBooks();
        for (String book : books) {
            System.out.println("Book: " + book);
        }
    }
}
