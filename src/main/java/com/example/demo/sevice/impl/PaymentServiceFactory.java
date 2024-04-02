package com.example.demo.sevice.impl;

import com.example.demo.core.exception.NotFoundException;
import com.example.demo.sevice.PaymentService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class PaymentServiceFactory {

    private final Map<String, PaymentService> paymentServiceMap;

    public PaymentServiceFactory(Map<String, PaymentService> paymentServiceMap) {
        this.paymentServiceMap = paymentServiceMap;
    }

    public PaymentService getService(String serviceId) {
        PaymentService paymentService = paymentServiceMap.get(serviceId);
        if (Objects.isNull(paymentService))
            throw new NotFoundException("The service not found");
        return paymentService;
    }
}
