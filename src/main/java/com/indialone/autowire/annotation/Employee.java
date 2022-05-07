package com.indialone.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    // Priorities -> Constructor Injection > Setter Injection > Property Injection
    
    @Autowired // this is property injection
    @Qualifier("address3")
    private Address address;

    public Employee() {

    }

    // @Autowired
    public Employee(Address address2) {
        this.address = address2;
        System.out.println("Parameterized constructor");
    }

    public Address getAddress() {
        return address;
    }

    // @Autowired   // setter injection
    public void setAddress(Address address) {
        this.address = address;
    }

/*     @Autowired
    public void setAddress(Address address2) {
        this.address = address2;
    } */

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }
    
    

}
