package com.practice.turing;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;

import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static void main(String[] args) {
        Object obj = new Object[]{5, 2, new Object[]{7, -1}, 3, new Object[]{6, new Object[]{-13, 8}, 4}};
        Object[] ii = (Object[]) obj;

        System.out.println(productSum(ii));
    }

    public static int productSum(Object[] ii, int depth) {
        int sum = 0;
        for (int i = 0; i < ii.length; i++) {
            if (ii[i] instanceof Number) {
                int value = (int) ii[i];
                sum = sum + value;
            } else {
                sum += productSum((Object[]) ii[i], depth + 1);
            }
        }

        return sum * depth;
    }

    public static int productSum(Object[] ii) {
        return productSum(ii, 1);
    }
}
