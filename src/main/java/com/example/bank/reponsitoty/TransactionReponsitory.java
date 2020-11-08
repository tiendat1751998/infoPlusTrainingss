package com.example.bank.reponsitoty;

import com.example.bank.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionReponsitory extends JpaRepository<Transaction,String> {
    public void processTransferMoney();


}
