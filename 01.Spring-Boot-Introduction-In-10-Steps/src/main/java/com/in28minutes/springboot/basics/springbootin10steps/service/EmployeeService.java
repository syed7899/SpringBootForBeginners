package com.in28minutes.springboot.basics.springbootin10steps.service;

import com.in28minutes.springboot.basics.springbootin10steps.entity.Employee;
import com.in28minutes.springboot.basics.springbootin10steps.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    
    public Employee getEmployee(int id){
        employeeRepository.findById(id);
    }

}
