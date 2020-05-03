package com.books.detailhub.controllers;

import com.books.detailhub.models.Books;
import com.books.detailhub.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Books> list() {
        return bookRepository.findAll();

    }


    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    @ResponseStatus(HttpStatus.OK)
    public Books createOrUpdate(@RequestBody Books book) {

        return this.bookRepository.save(book);
    }

    @GetMapping("/{book_id}")
    public Books search(@PathVariable("book_id") int id) {

        return bookRepository.getOne(id);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") int id) {

        bookRepository.deleteById(id);
    }


}
