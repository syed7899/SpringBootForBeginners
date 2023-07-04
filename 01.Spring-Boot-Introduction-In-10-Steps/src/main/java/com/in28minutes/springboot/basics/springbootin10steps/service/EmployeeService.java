package com.in28minutes.springboot.basics.springbootin10steps.service;

import com.in28minutes.springboot.basics.springbootin10steps.entity.Employee;
import com.in28minutes.springboot.basics.springbootin10steps.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        System.out.println("findAll has been called **");
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee;

    }
}
