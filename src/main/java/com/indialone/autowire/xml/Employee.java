package com.indialone.autowire.xml;

public class Employee {
    
    private Address address;

    public Employee() {

    }

    public Employee(Address address) {
        this.address = address;
        System.out.println("Parameterized constructor");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }
    
    

}
