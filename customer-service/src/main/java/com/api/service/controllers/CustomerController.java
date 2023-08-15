package com.api.service.controllers;

import com.api.service.entities.Customer;
import com.api.service.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok(customerService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getById(@PathVariable Integer id){
        return customerService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return customerService.delete(id) ? ResponseEntity.ok("Eliminado correctamente, id:" + id)
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        customer.setId(null);
        return ResponseEntity.ok(customerService.save(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable Integer id,@RequestBody Customer customer){
        return customerService.exist(id)? ResponseEntity.ok(customerService.save(customer)) :
                ResponseEntity.notFound().build();
    }
}
