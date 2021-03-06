package com.logicstudio.openbankingapp.web;

import com.logicstudio.openbankingapp.entity.Transaction;
import com.logicstudio.openbankingapp.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{accountNumber}")
    public List<Transaction> findAllByAccountNumber(@PathVariable("accountNumber") Integer accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
