package com.java8.practice.map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayToMap {

    public static void main(String[] args) {
        Integer[] arr={1,4,6,7,8,19,45,-1,56};

        //This is the a way but if there are duplicate keys then it will throw an exception
       Map<Integer,Integer> map1= Arrays.stream(arr)
               .collect(Collectors.toMap(Function.identity(),
                       Function.identity()));
        System.out.println(map1);

        //This is the 2nd way, if there is any possibility of duplicate key and we have a case to merge those values of same key, it takes 3
        // 3rd argument as BiFunction which will merge the values of same key
        Integer[] arr1={1,1,4,6,7,8,19,45,-1,56};

        Map<Integer,Integer> map2= Arrays.stream(arr1).collect(Collectors.toMap(Function.identity(),
                Function.identity(), (x,y)->x+y));
        System.out.println(map2);

        // this is the 3rd way, it will
        Integer[] arr3={1,1,4,6,7,8,19,45,-1,56};
        Map<Integer,Integer> map3= Arrays.stream(arr1).collect(Collectors.toMap(Function.identity(),
                Function.identity(), (x,y)->x+y, TreeMap::new));
        System.out.println(map3);
    }
}
