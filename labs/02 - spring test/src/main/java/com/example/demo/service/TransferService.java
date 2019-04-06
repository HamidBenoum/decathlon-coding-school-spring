package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.repository.TransferRepository;

@Component
public class TransferService {

    private TransferRepository transferRepository;

    @Autowired
    public TransferService(TransferRepository transferRepository){
        this.transferRepository = transferRepository;
    }

    public int getTransferCount(){
        return 5;
    }

    public TransferRepository getTransferRepository() {
        return transferRepository;
    }
}