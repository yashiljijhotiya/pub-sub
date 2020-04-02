package com.MessageBroker.MessageBroker.controller;
import com.MessageBroker.MessageBroker.models.Topic;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topic")
public class MessageBrokerController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @PostMapping("/add")
    public boolean addTopic(@RequestBody Topic topic){
        return true;
    }

    @DeleteMapping("/remove")
    public boolean removeTopic(@RequestBody Topic topic){
        return true;
    }

}
