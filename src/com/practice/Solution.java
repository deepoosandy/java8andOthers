package com.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'segment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER x
     *  2. INTEGER_ARRAY space
     */

    public static void main(String[] args) {
        int x = 2;
        List<Integer> space = Arrays.asList(8, 2, 4, 6);
        System.out.println(segment(x, space));


    }

    public static int segment(int x, List<Integer> space) {

        int min = space.get(0);
        for (int i = 0; i < x; i++) {
            if (space.get(i) < min)
                min = space.get(i);
        }
        for (int i = x + 1; i < space.size(); i++) {
            if (min > space.get(i)) {
                min = space.get(i);
            }
        }

        return min;
    }

}
