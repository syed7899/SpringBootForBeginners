package com.in28minutes.springboot.basics.springbootin10steps.controller;

import com.in28minutes.springboot.basics.springbootin10steps.entity.Address;
import com.in28minutes.springboot.basics.springbootin10steps.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AddressController {


    private AddressRepository addressRepository;

    @PostMapping("/address")
    public Address saveAddress(@RequestBody Address address){
        addressRepository.save(address);
        return address;
    }
}
