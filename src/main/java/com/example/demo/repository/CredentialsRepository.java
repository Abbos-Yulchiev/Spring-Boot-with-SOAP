package com.example.demo.repository;

import com.example.demo.entity.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CredentialsRepository extends
        JpaRepository<Credentials, Long>,
        JpaSpecificationExecutor<Credentials> {

    Optional<Credentials> findByUsername(String username);
}
