package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
        // Load context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // This must be fetched from context!
        BookService service = (BookService) context.getBean("bookService");

        // Now it will have bookRepository injected
        service.displayBooks();
    }
}
