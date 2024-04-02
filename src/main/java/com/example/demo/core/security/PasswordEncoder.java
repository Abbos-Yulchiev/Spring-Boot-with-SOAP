package com.example.demo.core.security;

import com.example.demo.core.exception.BadRequestException;
import com.example.demo.core.exception.UnauthorizedException;
import jakarta.xml.bind.DatatypeConverter;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncoder {

    //prevents from instantiating
    private PasswordEncoder() {
    }

    public static String encodePassword(String username, String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update((username + password)
                    .getBytes(StandardCharsets.UTF_8), 0, (username + password).length());

            return DatatypeConverter.printHexBinary(messageDigest.digest()).toLowerCase();

        } catch (NoSuchAlgorithmException e) {
            throw new BadRequestException("No such Algorithm is exist!");
        }
    }

    public static void credentialsComparator(String savedPassword, String username, String password) {
        if (!savedPassword.equals(encodePassword(username, password))) {
            throw new UnauthorizedException("Unauthorized");
        }
    }
}
