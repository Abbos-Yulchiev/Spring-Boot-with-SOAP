package com.example.demo.sevice.impl;

import com.example.demo.core.util.Utilities;
import com.example.demo.entity.Wallet;
import com.example.demo.provider.uws.*;
import com.example.demo.repository.WalletRepository;
import com.example.demo.sevice.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeFactory;
import java.time.Instant;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements PaymentService {

    private final WalletRepository walletRepository;
    private final TransactionServiceImpl transactionService;

    @Override
    public PerformTransactionResult performTransaction(PerformTransactionArguments arguments) {
        Wallet wallet = getWallet(arguments.getParameters());
        Long successTransactionId = transactionService.createSuccessTransaction(arguments);
        wallet.setBalance(wallet.getBalance() + arguments.getAmount());
        Wallet saved = walletRepository.save(wallet);
        return mapSuccessPerformTransactionResponse(saved, successTransactionId);
    }

    @Override
    @SneakyThrows
    public GetInformationResult getInformation(GetInformationArguments arguments) {

        Wallet wallet = getWallet(arguments.getParameters());
        GetInformationResult result = new GetInformationResult();
        result.setStatus(1);
        result.setTimeStamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(Instant.now().toString()));

        result.getParameters()
                .addAll(List.of(
                        getGenericParam("CurrentBalance", wallet.getBalance().toString()),
                        getGenericParam("Username", wallet.getOwnerFullName())
                ));
        return result;
    }


    private Wallet getWallet(List<GenericParam> parameters) {
        Wallet wallet;
        String account = Utilities.getValueByKey(parameters, "CurrentAccount");
        if (Objects.nonNull(account)) {
            wallet = walletRepository.findByAccount(account).orElseThrow(() -> new NoSuchElementException("Wallet is not found"));
        } else {
            String phone = Objects.requireNonNull(Utilities.getValueByKey(parameters, "phoneNumber"));
            wallet = walletRepository.findByPhone(phone).orElseThrow(() -> new NoSuchElementException("Wallet is not found"));
        }
        return wallet;
    }

    @SneakyThrows
    private PerformTransactionResult mapSuccessPerformTransactionResponse(Wallet entity, Long transactionId) {
        PerformTransactionResult result = new PerformTransactionResult();
        result.setProviderTrnId(transactionId);
        result.setTimeStamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(Instant.now().toString()));
        result.setStatus(1);

        result.getParameters()
                .addAll(List.of(
                        getGenericParam("CurrentAccount", entity.getAccountNumber()),
                        getGenericParam("CurrentBalance", entity.getBalance().toString())
                ));
        return result;
    }

    private GenericParam getGenericParam(String paramKey, String paramValue) {
        GenericParam param = new GenericParam();
        param.setParamKey(paramKey);
        param.setParamValue(paramValue);
        return param;
    }
}
