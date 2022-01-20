package com.java8.practice.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheOccurrenceOfWordsInALine {

    public static void main(String[] args) {
        String line = "Speaking of “full Unicode support” and Emojis, it’s worth pointing out that even using codepoints is not necessarily providing the intended semantics. E.g. \"ā̧\uD83D\uDC69\u200D\uD83C\uDDEE\uD83C\uDDE9\" has 10 chars, 7 codepoints, but only three characters; the first one demonstrates that this is not only an Emoji issue. The only solution, I currently know of, is to process grapheme clusters, e.g. with Java 9+:";
        Map<String, Long> occurrence = Arrays.stream(line.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrence);


        System.out.println(Arrays.stream(line.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.toSet())));
    }


}
