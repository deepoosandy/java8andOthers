package com.practice;

public class WipTest {
    public static void main(String[] args) {
        Employee e1=new Employee("xyz", 10);
        Employee e2=new Employee("xyz", 10);
        if(e1==e2){
            System.out.println("e1==e2");
        }
        if(e1.equals(e2)){
            System.out.println("In equals");
        }

    }
}
class Employee{
    int empId;
    String name;

    public Employee(String name, int empId){
        this.empId=empId;
        this.name=name;
    }
    public boolean equals(Object e){
        Employee e1=(Employee)e;
        if(this.name.equals(e1.name) && this.empId==((Employee) e).empId){
            return true;
        }
        return false;
    }
}