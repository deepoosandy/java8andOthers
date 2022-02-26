package com.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayMaxFre {
    public static void main(String[] args) {
        int[] arr={1,2,3,3, 11,11,11, 12};

        Map<Integer, Long> map= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x->
                x, Collectors.counting()));
       Map.Entry<Integer, Long> entry= map.entrySet().stream().reduce( (a,b)->
               a.getValue()>(b.getValue()) ? a:b ).get();

        System.out.println(entry.getValue()+" "+ entry.getKey());

    }
}
