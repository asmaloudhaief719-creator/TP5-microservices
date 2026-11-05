package com.iset.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.iset.entities.Customer;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerService {

    @GetMapping("/customers/{id}")
    Customer findCustomerById(@PathVariable("id") Long id);
}