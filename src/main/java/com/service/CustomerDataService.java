package com.service;

import com.dto.CustomerData;
import com.entity.CustomerEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface CustomerDataService {

    public CustomerEntity getCustomerDetailsByEmail(String email);

    public void registerCustomer(CustomerData customerData);

}
