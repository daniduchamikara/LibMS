package edu.dan.LibMS;

import edu.dan.LibMS.model.Book;
import edu.dan.LibMS.repositary.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }
}
