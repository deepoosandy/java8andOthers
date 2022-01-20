package com.java8.practice.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.stream.Collectors;

public class SortAMapByItsValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "e");
        map.put(3, "z");
        map.put(4, "q");

        Map<Integer, String> newMap = map.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).collect(Collectors.
                toMap(e -> e.getKey(), e -> e.getValue(), (x, y) -> x + y, LinkedHashMap::new));

        System.out.println(newMap);
    }
}
