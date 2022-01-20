package com.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueTuples {

    public static void main(String[] args) {

        System.out.println(uniqeTuplesMethod("aawefwfwfwefwfwwiouioqfnb", 2));


    }

    static Set<String> uniqeTuplesMethod(String str, int length) {
        Set<String> tuples = new LinkedHashSet<>();
        for (int i = 0; i < str.length()-(length-1); i ++) {
                String tuple = str.substring(i, i + length);
                tuples.add(tuple);

        }
        return tuples;
    }

    static Set<String> uniqeTuplesMethodUsingJdk8(String str, int length) {


       // Stream.of(str.split("")).filter()

        return null;
    }
}
