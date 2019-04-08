package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.example.demo.repository.TransferRepository;

@Component
public class TransferService {

    private final String currency;

    private TransferRepository transferRepository;

    @Autowired
    public TransferService(TransferRepository transferRepository, @Value("${myapp.currency}") String currency){
        this.transferRepository = transferRepository;
        this.currency = currency;
    }

    public int getTransferCount(){
        return 5;
    }

    public TransferRepository getTransferRepository() {
        return transferRepository;
    }

    public String getCurrency() {
        return currency;
    }
}