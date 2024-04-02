package com.example.demo;

import com.example.demo.core.security.PasswordEncoder;
import com.example.demo.entity.Credentials;
import com.example.demo.repository.CredentialsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithSoapApplication implements CommandLineRunner {

    private final CredentialsRepository credentialRepository;

    public SpringBootWithSoapApplication(CredentialsRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithSoapApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        String username = "username";
        String password = "password";
        if (credentialRepository.findByUsername(username).isEmpty()) {
            credentialRepository.save(new Credentials(username, PasswordEncoder.encodePassword(username, password)));
        }
    }
}
