package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TransferRepository {

    private String username;

    // TODO 1: Inject dbpass property
    public TransferRepository(@Value("${spring.datasource.username}") String userName){
        this.username = userName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}