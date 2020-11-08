package com.example.bank.controller;

import com.example.bank.Entity.Message;
import com.example.bank.service.MessageService;
import com.example.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/message",produces = "application/json")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> findAll()
    {
       return messageService.findAll();

    }
    @GetMapping()
    public Optional<Message> findById(@PathVariable  Long messageId)
    {
        Optional<Message> message = messageService.findById(messageId);
        return message;
    }

    @PutMapping("/saved")
    public  Message save(@RequestBody  Message message)
    {
        return  messageService.save(message);
    }
}
