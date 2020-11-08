package com.example.bank.service;

import com.example.bank.Entity.Message;
import com.example.bank.reponsitoty.MessageReponsitory;
import com.example.bank.reponsitoty.TransactionReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageReponsitory messageReponsitory;
    @Autowired
    private TransactionReponsitory transactionReponsitory;

    public Optional<Message> findById(Long Id)
    {
        return messageReponsitory.findById(Id);
    }
    public List<Message> findAll()
    {
       return   messageReponsitory.findAll();

    }
    @Transactional
    public Message save(Message message)
    {
       return  messageReponsitory.save(message);
    }
}
