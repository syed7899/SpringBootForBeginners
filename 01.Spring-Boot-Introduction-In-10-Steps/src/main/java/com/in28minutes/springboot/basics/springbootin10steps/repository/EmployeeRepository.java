package com.in28minutes.springboot.basics.springbootin10steps.repository;


import com.in28minutes.springboot.basics.springbootin10steps.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
