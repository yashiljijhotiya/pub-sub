package com.MessageBroker.MessageBroker.controller;

import com.MessageBroker.MessageBroker.models.Subscriber;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscriber")
public class SubscriberController {


    @PostMapping("/add")
    public boolean addSubscriber(@RequestBody Subscriber subscriber){
        return  true;
    }

    @DeleteMapping("/remove")
    public boolean removeSubscriber(@RequestBody Subscriber subscriber){
        return  true;
    }
}
