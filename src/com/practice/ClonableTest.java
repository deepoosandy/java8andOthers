package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ClonableTest {
    public static void main(String[] args) {
     Employeetest e= new Employeetest("xyz",20);
     Employeetest e2= new Employeetest("xyz",20);
        Employeetest e3= new Employeetest("xyz",20);
        HashMap<Employeetest,String>map=new HashMap<>();
        map.put(e,"e1");
        map.put(e2,"e2");
        System.out.println(map.get( new Employeetest("xyz",20)));
        Iterator ii=map.entrySet().iterator();
        while (ii.hasNext()){
            System.out.println(ii.next());
           // map.put(e3,null);
        }
        ArrayList<String>xx=new ArrayList<>();
        xx.add("aAA");
        xx.add("bb");
        xx.add("cc");
        for(String x: xx){
            System.out.println(x);
            xx.add(x);
        }

        System.out.println(map.size());


    }
}

class Employeetest implements Cloneable{
String name;
int age;

    public Employeetest(String name, int age) {
        this.name = name;
        this.age = age;
    }
}