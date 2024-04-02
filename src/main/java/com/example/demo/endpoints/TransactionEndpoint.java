package com.example.demo.endpoints;

import com.example.demo.core.security.CheckCredential;
import com.example.demo.provider.uws.*;
import com.example.demo.sevice.PaymentService;
import com.example.demo.sevice.impl.PaymentServiceFactory;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.namespace.QName;

@Endpoint
public class TransactionEndpoint {

    private static final String NAMESPACE_URI = "http://uws.provider.com/";

    private final PaymentServiceFactory paymentService;

    public TransactionEndpoint(PaymentServiceFactory paymentService) {
        this.paymentService = paymentService;
    }

    @CheckCredential
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PerformTransactionArguments")
    public JAXBElement<PerformTransactionResult> performTransaction(@RequestPayload JAXBElement<PerformTransactionArguments> transactionArguments) {
        PaymentService service = paymentService
                .getService(String.valueOf(transactionArguments
                        .getValue()
                        .getServiceId()));
        return createJaxbElement(service.performTransaction(transactionArguments.getValue()),
                PerformTransactionResult.class);
    }

    @CheckCredential
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetInformationArguments")
    public JAXBElement<GetInformationResult> getInformation(@RequestPayload JAXBElement<GetInformationArguments> informationArguments) {
        PaymentService service = paymentService.getService(String.valueOf(informationArguments.getValue().getServiceId()));
        return createJaxbElement(service.getInformation(informationArguments.getValue()), GetInformationResult.class);
    }

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CheckTransactionArguments")
    public JAXBElement<CheckTransactionResult> checkTransaction(@RequestPayload JAXBElement<CheckTransactionArguments> checkTransactionArguments) {
        return createJaxbElement(new CheckTransactionResult(), CheckTransactionResult.class);
    }


    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CancelTransactionArguments")
    public JAXBElement<CancelTransactionResult> cancelTransaction(@RequestPayload JAXBElement<CancelTransactionArguments> cancelTransactionArguments) {
        return createJaxbElement(new CancelTransactionResult(), CancelTransactionResult.class);
    }


    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetStatementArguments")
    public JAXBElement<GetStatementResult> getStatement(@RequestPayload JAXBElement<GetStatementArguments> getStatementArguments) {
        return createJaxbElement(new GetStatementResult(), GetStatementResult.class);
    }

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangePasswordArguments")
    public JAXBElement<ChangePasswordResult> changePassword(@RequestPayload JAXBElement<ChangePasswordArguments> changePasswordArguments) {
        return createJaxbElement(new ChangePasswordResult(), ChangePasswordResult.class);
    }

    private <T> JAXBElement<T> createJaxbElement(T value, Class<T> type) {
        return new JAXBElement<>(new QName(type.getSimpleName()), type, value);
    }
}
