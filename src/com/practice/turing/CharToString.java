package com.practice.turing;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharToString {
    public static void main(String[] args) {
        String characters = "a hsgalhsa sanbjksbdkjba kjx";
        String document = "";
        
        Map<String, Integer> input = Arrays.stream(characters.split(""))
                .collect(Collectors.toMap(x -> x, y -> 1, (a, b) -> a + b));
        Map<String, Integer> documents = Arrays.stream(document.split(""))
                .collect(Collectors.toMap(x -> x, y -> 1, (a, b) -> a + b));
        boolean result = true;
        for (Map.Entry<String, Integer> entry : documents.entrySet()) {
            if (!input.containsKey(entry.getKey()) ||
                    input.get(entry.getKey()) < entry.getValue()) {
                result = false;
            }
        }
        System.out.println(result);
    }
}
