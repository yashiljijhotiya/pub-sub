package com.MessageBroker.MessageBroker.controller;

import com.MessageBroker.MessageBroker.models.Publisher;
import com.MessageBroker.MessageBroker.repository.IPublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private IPublisherRepository publisherRepository;

    @PostMapping("/add")
    public ResponseEntity<Publisher> addPublisher(@RequestBody Publisher publisher)
    {
        Publisher pub = publisherRepository.save(publisher);
        return new ResponseEntity<Publisher>(pub, HttpStatus.CREATED);

    }

    @DeleteMapping("/remove")
    public boolean removePublisher(@RequestBody Publisher publisher){
        return true;
    }
}
