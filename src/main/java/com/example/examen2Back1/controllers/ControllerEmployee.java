package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Employee;
import com.example.examen2Back1.services.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class ControllerEmployee {

    @Autowired
    private ServiceEmployee serviceEmployee;

    // POST Method

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceEmployee.createEmployee(data));
    }

    // GET Method

    @GetMapping
    public ResponseEntity<List<Employee>> readEmployee() {
        return ResponseEntity.ok(serviceEmployee.readEmployee());
    }

    // GET By ID Method
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> readEmployeeById(@PathVariable Integer id) {
        Optional<Optional<Employee>> result = Optional.ofNullable(serviceEmployee.getEmployeeById(id));
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // PUT Method

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee data) {
        Employee updated = serviceEmployee.updateEmployee(id, data);
        return (updated != null) ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    // DELETE Method

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
        return serviceEmployee.deleteEmployee(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
