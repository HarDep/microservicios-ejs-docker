package com.api.service.services;

import com.api.service.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAll();
    Optional<Employee> getById(Integer id);
    Employee save(Employee employee);
    boolean delete(Integer id);
    boolean exist(Integer id);
}
