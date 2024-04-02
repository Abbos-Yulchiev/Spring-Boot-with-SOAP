package com.example.demo.entity.enums;

import lombok.Getter;

@Getter
public enum ServiceTypes {

    WALLET("0");

    private final String id;

    ServiceTypes(String id) {
        this.id = id;
    }
}
