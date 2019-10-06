package com.entity;

import com.dto.CustomerData;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER_DETAILS")
@NamedQuery(name="findbyEmail",query = "select c from CustomerEntity c where c.username=?1")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="FIRSTNAME")
    private String firstName;

    @Column(name="LASTNAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="CONTACT")
    private String contact;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PASSWORD")
    private String password;

    public CustomerEntity(CustomerData customerData){
        this.firstName = customerData.getFirstName();
        this.lastName = customerData.getLastName();
        this.email = customerData.getEmail();
        this.contact = customerData.getContact();
        this.password = customerData.getPassword();
    }

}
