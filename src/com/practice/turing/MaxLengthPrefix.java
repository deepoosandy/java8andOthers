package com.practice.turing;

import java.util.Arrays;

public class MaxLengthPrefix {
    public static void main(String[] args) {

        String[] arr = {"java2blog", "javaworld", "javabean", "javatemp"};
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            String finalPrefix = "";
            int length = prefix.length() > arr[i].length() ? arr[i].length() : prefix.length();
            for (int j = 0; j <= length; j++) {
                if (prefix.substring(0, j).equals(arr[i].substring(0, j))) {
                    finalPrefix = prefix.substring(0, j);
                }
            }
            prefix = finalPrefix;

        }
        System.out.println(prefix);
        System.out.println(longestPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestPrefix(String a[]) {
        int size = a.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        /* sort the array of strings */
        Arrays.sort(a);

        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size - 1].length());

        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
            i++;

        String pre = a[0].substring(0, i);
        return pre;
    }

}
