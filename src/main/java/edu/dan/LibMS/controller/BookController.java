package edu.dan.LibMS.controller;

import edu.dan.LibMS.BookService;
import edu.dan.LibMS.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/hello")
    public String hello(){
        Book book=new Book();
        book.setBookName("Thimira");
        book.setBookAuth("DAnidu");
        book.setBookisbn("000000");
        bookService.saveBook(book);
        return "Hello World";
    }

    @GetMapping("/update")
    public Book update(){
        Book book=new Book();
        book.setBookId(1);
        book.setBookName("Kasun");
        book.setBookAuth("Manos");
        book.setBookisbn("111111");
        Book  book1=bookService.saveBook(book);
        return book1;
    }
}
