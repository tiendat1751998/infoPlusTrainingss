package com.example.bank.reponsitoty;

import com.example.bank.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageReponsitory extends JpaRepository<Message,Long> {
}
