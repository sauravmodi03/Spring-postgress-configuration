package com.repository;

import com.dto.CustomerData;
import com.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {
    CustomerEntity findByEmail(String email);
}
