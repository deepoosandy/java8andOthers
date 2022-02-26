package com.practice.turing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastFailSafeCheck {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator ii=list.iterator();
        while (ii.hasNext()){
            //ii.hasNext();
            ii.remove();
        }
        System.out.println(list);

    }
}
