package com.api.service.controllers;

import com.api.service.entities.Employee;
import com.api.service.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(employeeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Integer id){
        return employeeService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return employeeService.delete(id) ? ResponseEntity.ok("Eliminado correctamente, id:" + id)
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        employee.setId(null);
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable Integer id,@RequestBody Employee employee){
        return employeeService.exist(id)? ResponseEntity.ok(employeeService.save(employee)) :
                ResponseEntity.notFound().build();
    }
}
