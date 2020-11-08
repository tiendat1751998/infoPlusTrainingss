package com.example.bank.controller;

import com.example.bank.Entity.Transaction;
import com.example.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/bank",produces = "application/json")
public class TransactionController {
   @Autowired
    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/gettransaction")
    public ResponseEntity<List<Transaction>> findAll()
    {
        List<Transaction> transaction = (List<Transaction>) transactionService.findAll();
        return new ResponseEntity<>(transaction,HttpStatus.OK);
    }
    @GetMapping("/gettransaction/{Id}")
    public ResponseEntity<Transaction> findById(@PathVariable String Id)
    {
        Optional<Transaction> transaction = transactionService.findByID(Id);
        return  new ResponseEntity(transaction,HttpStatus.OK);
    }
    @PostMapping("/")
    public Transaction save(@RequestBody Transaction transaction)
    {
        return  transactionService.save(transaction);
    }
    @PutMapping("/transfermoney")
    public ResponseEntity<Transaction> update(@PathVariable String transactionCode,@RequestBody Transaction transaction)
    {
        transactionService.findByID(transactionCode);
        Transaction transaction1 = transactionService.update(transactionCode,transaction);
        return  new ResponseEntity<>(transaction1,HttpStatus.OK);
    }
//    @GetMapping
//    public Optional<Message> processTransferMoney()
//    {
//        return transactionService.processTransferMoney();
//    }

}
