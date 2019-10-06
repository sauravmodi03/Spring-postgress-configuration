package com.controller;

import com.dto.CustomerData;
import com.entity.CustomerEntity;
import com.service.CustomerDataService;
import com.service.CustomerDataServiceImpl;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    CustomerDataService customerDataService;

    @RequestMapping(value = "/sayHello/{value}", method = RequestMethod.GET)
    public String sayHelloWorld(@PathVariable("value") String value){
        System.out.println(value);
        return value;
    }

    @RequestMapping(value = "/getCustomer/{value}", method = RequestMethod.GET)
    public String getCustomerDetails(@PathVariable("value") String value){
        CustomerEntity customerData = customerDataService.getCustomerDetailsByEmail(value);
        return value;
    }

    @RequestMapping(path = "/registerCustomer/{firstName}/{lastName}/{email}/{password}", method = RequestMethod.GET)
    public void registerCustomer(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName,@PathVariable("email") String email,@PathVariable("password") String password){
        CustomerData customerData = new CustomerData();
        customerData.setFirstName(firstName);
        customerData.setLastName(lastName);
        customerData.setEmail(email);
        customerData.setPassword(password);
        customerDataService.registerCustomer(customerData);
    }
}
