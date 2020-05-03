package com.books.detailhub.controllers;

import com.books.detailhub.models.Publishers;
import com.books.detailhub.repositories.PublishersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/publisher")
public class PublishersController {

        @Autowired
        private PublishersRepository publisherRepository;

        @GetMapping
        public List<Publishers> list(){
            return publisherRepository.findAll();

        }


        @GetMapping("/{publisher_id}")
        public Publishers search(@PathVariable("publisher_id") int id){
            return publisherRepository.getOne(id);
        }


}
