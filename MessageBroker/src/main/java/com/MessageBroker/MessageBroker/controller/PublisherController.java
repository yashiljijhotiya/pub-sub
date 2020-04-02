package com.MessageBroker.MessageBroker.controller;

import com.MessageBroker.MessageBroker.models.Publisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    @PostMapping("/add")
    public boolean addPublisher(@RequestBody Publisher publisher){
        return true;
    }

    @DeleteMapping("/remove")
    public boolean removePublisher(@RequestBody Publisher publisher){
        return true;
    }
}
