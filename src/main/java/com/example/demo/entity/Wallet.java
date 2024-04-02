package com.example.demo.entity;

import com.example.demo.entity.audit.Auditable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Wallet extends Auditable {

    private String ownerFullName;

    @Column(unique = true)
    private String accountNumber;

    @Column(unique = true)
    private String phoneNumber;

    private Long balance;
}

