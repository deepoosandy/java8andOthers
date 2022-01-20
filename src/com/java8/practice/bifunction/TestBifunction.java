package com.java8.practice.bifunction;

import java.util.function.BiFunction;

public class TestBifunction {
    public static void main(String[] args) {
//Represents a function that accepts two arguments and produces a result.
 //BiFunction<T,U,R>
        //Where T is first argument
        //U is second argument
        //R is the return
        BiFunction<Integer, Integer, String> biFunctionExample =
                (x, y) -> "Sum of the given numbers are : " + (x + y);

        System.out.println(biFunctionExample.apply(4, 5));
    }
}
