package com.example.demo.core.exception;

public class DataAlreadyExistException extends RuntimeException {


    public DataAlreadyExistException() {
    }

    public DataAlreadyExistException(String message) {
        super(message);
    }

    public DataAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
