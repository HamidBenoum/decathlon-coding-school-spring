package com.example.demo;

import com.example.demo.repository.TransferRepository;
import com.example.demo.service.TransferService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationIntegrationTests {

    @Autowired
    private TransferService transferService;

    @Autowired
    private TransferRepository transferRepository;

    @Test
    public void should_transferRepository_username_not_be_null() {
        Assertions.assertThat(transferRepository.getUsername()).isEqualTo("dbuser");
        // TODO 2: test dbpass
    }

    @Test
    public void should_currency_equal_to_eur(){
        Assertions.assertThat(transferService.getCurrency()).isEqualTo("euro");
    }

}
