package com.example.demo.sevice;

import com.example.demo.provider.uws.GetInformationArguments;
import com.example.demo.provider.uws.GetInformationResult;
import com.example.demo.provider.uws.PerformTransactionArguments;
import com.example.demo.provider.uws.PerformTransactionResult;

public interface PaymentService {

    PerformTransactionResult performTransaction(PerformTransactionArguments arguments);

    GetInformationResult getInformation(GetInformationArguments arguments);
}
