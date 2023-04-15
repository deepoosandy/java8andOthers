package com.java8.practice.map;

import java.util.ArrayList;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>>outerList=new ArrayList<>();
        List<String>innerList1=new ArrayList<>();
        List<String>innerList2=new ArrayList<>();
        innerList1.add("Sandeep");
        innerList1.add("Kumar");
        innerList2.add("Jaiswal");
        innerList2.add("Balrampur");
        outerList.add(innerList1);
        outerList.add(innerList2);

       outerList.stream().flatMap(inner->inner.stream()).forEach(System.out::println);
    }

}

