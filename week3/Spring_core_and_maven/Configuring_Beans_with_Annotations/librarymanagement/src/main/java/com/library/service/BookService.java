package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {
    private BookRepository bookRepository; // must be private

    // Correct public setter method
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        List<String> books = bookRepository.getAllBooks();
        for (String book : books) {
            System.out.println("Book: " + book);
        }
    }
}
