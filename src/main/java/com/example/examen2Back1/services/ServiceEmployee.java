package com.example.examen2Back1.services;

import com.example.examen2Back1.models.Employee;
import com.example.examen2Back1.repositories.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmployee {

    @Autowired
    private IEmployeeRepository employeeRepository;

    // Create Method

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    // Read Method
    public List<Employee> readEmployee() {
        return employeeRepository.findAll();
    }

    // Read By Id Method
    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }
    
    // Update Method

    public Employee updateEmployee(Integer id, Employee updatedEmployee) {
        Optional<Employee> optionalBranch = employeeRepository.findById(id);

        if (optionalBranch.isPresent()) {
            Employee existing = optionalBranch.get();
            existing.setName(updatedEmployee.getName());
            existing.setLastName(updatedEmployee.getLastName());
            existing.setDNI(updatedEmployee.getDNI());
            existing.setEmail(updatedEmployee.getEmail());
            existing.setPhone(updatedEmployee.getPhone());
            existing.setBirthDate(updatedEmployee.getBirthDate());
            existing.setPosition(updatedEmployee.getPosition());
            existing.setSigningDate(updatedEmployee.getSigningDate());
            existing.setSalary(updatedEmployee.getSalary());
            existing.setLikes(updatedEmployee.getLikes());
            return employeeRepository.save(existing);
        }
        return null;
    }
    
    // Delete Method

    public boolean deleteEmployee(Integer id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
}
