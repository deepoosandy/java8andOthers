package com.java8.practice.map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCount {

    public static void main(String[] args) {
        StringBuilder result=new StringBuilder();
        Arrays.stream("Original".split(""))
                .collect(Collectors.toMap(x->x,y->1,(p,q)->p+q, LinkedHashMap::new)).forEach((k,v)->{
                    result.append(k).append(v);
                });

        System.out.println(result);
    }
}
