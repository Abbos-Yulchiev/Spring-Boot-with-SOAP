package com.example.demo.sevice.impl;

import com.example.demo.core.exception.DataAlreadyExistException;
import com.example.demo.entity.Transaction;
import com.example.demo.entity.enums.ServiceTypes;
import com.example.demo.entity.enums.TransactionStatus;
import com.example.demo.provider.uws.PerformTransactionArguments;
import com.example.demo.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionServiceImpl {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Transactional
    public Long createSuccessTransaction(PerformTransactionArguments request) {
        String username = request.getUsername();
        String transactionId = String.valueOf(request.getTransactionId());
        transactionRepository.findTransactionsByProviderAndExtId(username, transactionId)
                .orElseThrow(() -> new DataAlreadyExistException("The transaction already exists"));
        Transaction entity = new Transaction(request.getAmount(), request.toString(), username,
                transactionId, ServiceTypes.WALLET, TransactionStatus.SUCCESS);
        return transactionRepository.save(entity).getId();
    }
}
