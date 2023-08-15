package com.api.service.services;

import com.api.service.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAll();
    Optional<Customer> getById(Integer id);
    Customer save(Customer customer);
    boolean delete(Integer id);
    boolean exist(Integer id);
}
