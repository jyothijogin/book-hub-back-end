package com.books.detailhub.controllers;

import com.books.detailhub.models.Authors;
import com.books.detailhub.repositories.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/authors")
public class AuthorsController {
    @Autowired
    private AuthorsRepository authorsRepository;

    @GetMapping
    public List<Authors> list(){
        return authorsRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Authors authors){
        authorsRepository.save(authors);

    }

    @GetMapping("/{author_id}")
    public Authors search(@PathVariable("author_id") int id){
        return authorsRepository.getOne(id);
    }


}
