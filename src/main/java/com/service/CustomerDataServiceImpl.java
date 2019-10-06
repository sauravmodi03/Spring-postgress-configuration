package com.service;

import com.dto.CustomerData;
import com.entity.CustomerEntity;
import com.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerDataServiceImpl implements CustomerDataService{

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public CustomerEntity getCustomerDetailsByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public void registerCustomer(CustomerData customerData) {
        CustomerEntity customerEntity = new CustomerEntity(customerData);
        customerRepository.save(customerEntity);
    }

}
