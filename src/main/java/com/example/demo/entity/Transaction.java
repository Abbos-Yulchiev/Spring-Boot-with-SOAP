package com.example.demo.entity;

import com.example.demo.entity.audit.Auditable;
import com.example.demo.entity.enums.ServiceTypes;
import com.example.demo.entity.enums.TransactionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "TRANSACTIONS")
public class Transaction extends Auditable {

    private Long amount;

    private String details;

    @Column(name = "provider", nullable = false)
    private String provider;

    @Column(nullable = false)
    private String extId;

    @Enumerated(value = EnumType.STRING)
    private ServiceTypes service;

    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

}
