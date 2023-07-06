package com.in28minutes.springboot.basics.springbootin10steps.controller;

import com.in28minutes.springboot.basics.springbootin10steps.entity.Employee;
import com.in28minutes.springboot.basics.springbootin10steps.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
private EmployeeService employeeService;

@GetMapping("/employees")
public List<Employee> getAllEmployees(){
         logger.info("getAllEmployees has been Called");
       return employeeService.findAll();
   }




    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
           Optional<Employee> emp= employeeService.getEmployee(id);
              Employee e=null;
            if(emp.isPresent()) {
                 logger.info("Employee Found with id:" + id);
                  e= emp.get();
             }
             else{
                logger.error("No Employee found with id :"+id);
             }
             return e;


    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        Employee emp= employeeService.createEmployee(employee);
        logger.info("Employee has been Saved His Name is {} "+emp.getName());
        return emp;
    }


    @GetMapping("/employee/{employeeid}/address/{addressId}")
    public Employee createEmployee(@PathVariable int employeeid, @PathVariable int addressId){
        Employee emp= employeeService.createEmployeeWithAddress(employeeid,addressId);
        logger.info("Employee has been Saved His Name is {} "+emp.getName());
        return emp;
    }

}
