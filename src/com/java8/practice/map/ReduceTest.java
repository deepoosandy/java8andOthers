package com.java8.practice.map;

import java.util.*;
import java.util.stream.Collectors;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        int sum = listOfNumbers.parallelStream().reduce(5, Integer::sum);
        System.out.println(sum);

        EmployeeAm e1 = new EmployeeAm("C1", "N1");
        EmployeeAm e2 = new EmployeeAm("C2", "N2");
        EmployeeAm e3 = new EmployeeAm("C3", "N3");

        List<EmployeeAm> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Map<String, String> map = list.stream().collect(Collectors.toMap(EmployeeAm::getCity, EmployeeAm::getName));
        System.out.println(map);

        e2 = new EmployeeAm("C1", "N2");
        e3 = new EmployeeAm("C3", "N3");
        list.add(e2);
        list.add(e3);

        map = list.stream().collect(Collectors.toMap(EmployeeAm::getCity, EmployeeAm::getName, (x, y) -> x + "|" + y));
        System.out.println("With merge : " + map);

        System.out.println("===========================");
        map = list.stream().collect(Collectors.toMap(EmployeeAm::getCity, EmployeeAm::getName, (x, y) -> x + "|" + y, LinkedHashMap::new));
        System.out.println("Mainting Key order With merge : " + map);

        System.out.println("===========================");
        Map<String, List<EmployeeAm>>mapByCity=list.stream().collect(Collectors.groupingBy(EmployeeAm::getCity, Collectors.toList()));

       mapByCity.entrySet().forEach(x->{
           System.out.println(x.getKey());
           x.getValue().forEach(y-> System.out.print(y.getName()));
           System.out.println();
       });
        System.out.println("===========================");

    Map<String, List<EmployeeAm>>map12=list.stream().collect(Collectors.groupingBy(EmployeeAm::getCity));
        map12.entrySet().forEach(x->{
            System.out.println(x.getKey());
            x.getValue().forEach(y-> System.out.print(y.getName()));
            System.out.println();
        });
        System.out.println("===========================");
        Map<String, List<EmployeeAm>>map123=list.stream().collect(Collectors.groupingBy(EmployeeAm::getCity,LinkedHashMap::new, Collectors.toList() ));
        map123.entrySet().forEach(x->{
            System.out.println(x.getKey());
            x.getValue().forEach(y-> System.out.print(y.getName()));
            System.out.println();
        });
    }
}

class EmployeeAm {
    String city;
    String name;

    EmployeeAm(String city,
               String name) {
        this.city = city;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@FunctionalInterface
interface IFunInterface {
    // An  abstract method  declared in the functional interface
    int add();

    // Re-declaration of the equals() method in the Object class
    boolean equals(Object obj);

//String toString();
}

