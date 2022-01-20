package com.java8.practice.biconsumer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class TestBiConsumer {
    public static void main(String[] args) {
        //Represents an operation that accepts two input arguments and returns no result.
        //BiConsumer<T,U>
        // where T is first argument and U is the second argument
        BiConsumer<Integer, Integer> biConsumer=(x, y)-> System.out.println(x+y);

        biConsumer.accept(2,5);
    }


}
