package com.api.service.services;

import com.api.service.entities.Customer;
import com.api.service.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll(){
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public boolean delete(Integer id) {
        if (customerRepository.existsById(id)){
            customerRepository.deleteById(id);
            return true;
        }else
            return false;
    }

    @Override
    public boolean exist(Integer id) {
        return customerRepository.existsById(id);
    }
}
