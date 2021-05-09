package com.logicstudio.openbankingapp.service;

import com.logicstudio.openbankingapp.entity.Transaction;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        return List.of(
                Transaction
                        .builder()
                        .type("credit")
                        .date(new Date())
                        .accountNumber(accountNumber)
                        .currency("USD")
                        .amount(1.5)
                        .merchantName("Netby")
                        .merchantLogo("images/netby-logo.png")
                        .build()
        );
    }
}
