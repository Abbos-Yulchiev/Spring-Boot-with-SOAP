package com.example.demo.core.security;

import com.example.demo.core.exception.NotFoundException;
import com.example.demo.core.exception.UnauthorizedException;
import com.example.demo.entity.Credentials;
import com.example.demo.provider.uws.GenericArguments;
import com.example.demo.repository.CredentialsRepository;
import jakarta.xml.bind.JAXBElement;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckCredentialAspect {

    private final CredentialsRepository repository;

    public CheckCredentialAspect(CredentialsRepository repository) {
        this.repository = repository;
    }

    @Before("@annotation(CheckCredentials)")
    public void checkCredentials(JoinPoint joinPoint) {

        Object[] args = joinPoint.getArgs();
        if (args.length == 1 && args[0] instanceof JAXBElement<?>) {
            JAXBElement<GenericArguments> arguments = (JAXBElement<GenericArguments>) args[0];
            GenericArguments req = arguments.getValue();
            Credentials user = repository.findByUsername(req.getUsername())
                    .orElseThrow(() -> new NotFoundException("The user is not found!"));
            PasswordEncoder.credentialsComparator(user.getPassword(), req.getUsername(), req.getPassword());
        } else {
            throw new UnauthorizedException("Unauthorized");
        }
    }
}
