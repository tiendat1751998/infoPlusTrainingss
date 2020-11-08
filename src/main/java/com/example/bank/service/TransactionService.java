package com.example.bank.service;

import com.example.bank.Entity.Message;
import com.example.bank.Entity.Transaction;
import com.example.bank.reponsitoty.MessageReponsitory;
import com.example.bank.reponsitoty.TransactionReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class TransactionService  {
    @Autowired
    private TransactionReponsitory transactionReponsitory;
    @Autowired
    private MessageReponsitory messageReponsitory;

   public List<Transaction> findAll()
    {
        return  transactionReponsitory.findAll();

    }
    public Optional<Transaction> findByID(String Id) {
        return transactionReponsitory.findById(Id);

    }
    @Transactional
    public Transaction save(Transaction transaction)
    {
        return  transactionReponsitory.save(transaction);
    }

    @Transactional
    public  Transaction update(String Id,Transaction transaction )
    {
        return  transactionReponsitory.save(transaction);
    }
    @Transactional
    public Optional<Message> processTransferMoney()
    {
        Transaction transaction = new Transaction();
        Message message = new Message();

        if (transaction.getTransactionCode() != null)
        {
            System.out.println(message.getMessageName()+"/n"+message.getMessageType());
            messageReponsitory.findById(message.getMessageId());
            transactionReponsitory.findAll();
        }
        else if (transaction.getTransactionCode()==null)
        {
            System.out.println(message.getMessageName()+"/n"+message.getMessageType());
            messageReponsitory.findById(message.getMessageId());
            transactionReponsitory.findAll();
        }
        else {
            System.out.println(message.getMessageName()+"/n"+message.getMessageType());
            messageReponsitory.findById(message.getMessageId());
            transactionReponsitory.findAll();
        }
        return processTransferMoney();
    }
}
