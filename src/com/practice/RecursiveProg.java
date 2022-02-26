package com.practice;

public class RecursiveProg {
    public static void main(String[] args) {
        System.out.println(reviserString("Sandeep", new StringBuilder()));
    }

    public static String reviserString(String inputString, StringBuilder result) {
        if (inputString.length() > 0) {
            String str = inputString.substring(inputString.length() - 1, inputString.length());
            inputString = inputString.substring(0, inputString.length() - 1);

            result.append(str);
            reviserString(inputString, result);
        }

        return result.toString();
    }
}
