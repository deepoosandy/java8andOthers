package com.practice.turing;

import java.util.Comparator;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address add= new Address("21");
        Employee e= new Employee(add);
        e.age=21;
        Employee c= (Employee)e.clone();
        System.out.println(c.address.zp);
        c.address.zp="23";
        System.out.println(e.address.zp);
        System.out.println(c.age);
        c.age=56;
        System.out.println(e.age);

    }
}
class Employee implements  Cloneable{
    Address address;
    int age;

    public Employee(Address address) {
        this.address = address;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Address{
    String zp;
    int id;

    public Address(String zp) {
        this.zp = zp;
    }
}
@FunctionalInterface
interface Consumer {

    int accept();


    }