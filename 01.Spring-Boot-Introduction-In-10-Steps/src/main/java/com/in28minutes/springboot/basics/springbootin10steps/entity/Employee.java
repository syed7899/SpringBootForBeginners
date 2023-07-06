package com.in28minutes.springboot.basics.springbootin10steps.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//@Data
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
@Entity
public class Employee {

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private BigDecimal salary;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Address> addressList=new ArrayList<>();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", addressList=" + addressList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public void addAddress(Address address) {
        if (address == null) {
            addressList = new ArrayList();
        }

        addressList.add(address);
        address.setEmployee(this);

    }
}
