package com.in28minutes.springboot.basics.springbootin10steps.entity;

import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

//@Data
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
@Entity
@Table(name="address")
public class Address {

    public Address(String city, String state, String zipcode, String country) {
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;

    }

    public Address() {

    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                ", employee=" + employee +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;

    private String city;
    private String state;
    private String zipcode;
    private String country;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employee_id")
    private Employee employee;





}
