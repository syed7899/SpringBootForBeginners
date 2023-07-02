package com.in28minutes.springboot.basics.springbootin10steps.controller;

import com.in28minutes.springboot.basics.springbootin10steps.entity.Employee;
import com.in28minutes.springboot.basics.springbootin10steps.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeController {

private EmployeeService employeeService;

@GetMapping("/employees")
public List<Employee> getAllEmployees(){

       return employeeService.findAll();
   }

}


    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id){

        return employeeService.getEmployee(id);
    }

}