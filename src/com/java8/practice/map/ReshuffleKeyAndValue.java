package com.java8.practice.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReshuffleKeyAndValue {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Sandeep");
        map.put(2, "Kumar");
        map.put(3, "Jaiswal");
        map.put(4, "Jaiswal");

        System.out.println("Before Reshuffling :" + map);
        Map<String, Integer> newMap =
                map.entrySet().stream().collect(Collectors.toMap(
                        e -> e.getValue(), e -> e.getKey(), (e1, e2) -> e1 + e2
                ));

        System.out.println("After Reshuffling :" + newMap);
    }


}
