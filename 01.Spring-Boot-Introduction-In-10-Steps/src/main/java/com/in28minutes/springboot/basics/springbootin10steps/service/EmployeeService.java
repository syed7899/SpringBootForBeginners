package com.in28minutes.springboot.basics.springbootin10steps.service;

import com.in28minutes.springboot.basics.springbootin10steps.controller.EmployeeController;
import com.in28minutes.springboot.basics.springbootin10steps.entity.Address;
import com.in28minutes.springboot.basics.springbootin10steps.entity.Employee;
import com.in28minutes.springboot.basics.springbootin10steps.repository.AddressRepository;
import com.in28minutes.springboot.basics.springbootin10steps.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    private EmployeeRepository employeeRepository;

    private AddressRepository addressRepository;

    public List<Employee> findAll() {
        System.out.println("findAll has been called **");
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee;

    }

    public Employee createEmployee(Employee employee) {
        Employee emp= employeeRepository.save(employee);
        return emp;
    }


    public Employee createEmployeeWithAddress(int employeeid, int addressId) {
        Employee employee=employeeRepository.findById(employeeid).get();
        Address address=addressRepository.findById(addressId).get();
        employee.addAddress(address);
        employeeRepository.save(employee);
        return employee;
    }
}
