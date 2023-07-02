package com.in28minutes.springboot.basics.springbootin10steps.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Employee {

    public Employee(String name, String address, BigDecimal salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;

    private BigDecimal salary;
}
