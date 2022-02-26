package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class SortEmployee {

    public static void main(String[] args) {
        Employee employee=new Employee("String name",  10);
        Employee employee1=new Employee("String name",  11);
        Employee employee2=new Employee("String name",  12);
        List<Employee> list=new ArrayList<>();
        list.add(employee);
        list.add(employee2);
        list.add(employee2);
        Collections.sort(list, new EmployeeComparator());
        list.forEach(x-> System.out.println(x.empId));

        System.out.println(25&13);

    }
}
class EmployeeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.empId < o2.empId) return 1;
        if(o1.empId > o2.empId) return -1;
        return 0;
    }
}
