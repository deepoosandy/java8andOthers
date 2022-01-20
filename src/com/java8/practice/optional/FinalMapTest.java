package com.java8.practice.optional;

import java.util.Map;

public class FinalMapTest {

    public static void main(String[] args) {
        OptionalDemo op=new OptionalDemo();
        Map<String, String> m=OptionalDemo.getMap();
        m.put(15+"",19+"");
        System.out.println(OptionalDemo.getMap().size());
    }
}
