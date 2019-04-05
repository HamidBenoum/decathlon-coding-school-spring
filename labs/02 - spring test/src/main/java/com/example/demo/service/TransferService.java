package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.repository.TransferRepository;

@Component
public class TransferService {

    @Autowired
    private TransferRepository transferRepository;

    public int getTransferCount(){
        return 5;
    }

}