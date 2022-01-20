package com.practice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {

    public static void main(String arg[]) {
        String input = "cat dog act tac sat tas god dog";
        System.out.println(anagramsGroup(input));

    }

    static String canonicalize(String s) {
        return Stream.of(s.split("")).sorted().collect(Collectors.joining());
    }

    static List<Set<String>> anagramsGroup(String str) {
        // String[] a= {"a","b"};
        //  Stream.of(a).collect(Collectors.joining());


        Map<String, Set<String>> values = Stream.of(str.split("\\s+")).collect(Collectors.groupingBy(GroupAnagrams::canonicalize, LinkedHashMap::new, Collectors.toSet()));

        List<Set<String>> result = values.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());


        return result;
    }

}
