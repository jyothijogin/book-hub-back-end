package com.books.detailhub.controllers;

import com.books.detailhub.models.Book_Authors;
import com.books.detailhub.repositories.Book_AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book_authors")
public class Book_Authorscontroller {
    @Autowired
    private Book_AuthorsRepository book_authorsRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Book_Authors book_authors){
        book_authorsRepository.save(book_authors);

    }

    @GetMapping("/{book_id}")
    public Book_Authors getauthorid(@PathVariable("book_id") int id){
        return book_authorsRepository.getOne(id);
    }
}
