package com.example.bank.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name = "transaction_code")
    private String transactionCode;
    @Column(name = "sender_acct")
    private String senderAcct;
    @Column(name = "receiver_acct")
    private String receiverAcct;
    @Column(name = "amount")
    private long amount;
    @Column(name = "currency")
    private String currency;
    @ManyToOne
    @JoinColumn(name = "message_id", nullable = false)
    private Message message;

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getSenderAcct() {
        return senderAcct;
    }

    public void setSenderAcct(String senderAcct) {
        this.senderAcct = senderAcct;
    }

    public String getReceiverAcct() {
        return receiverAcct;
    }

    public void setReceiverAcct(String receiverAcct) {
        this.receiverAcct = receiverAcct;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }


}
