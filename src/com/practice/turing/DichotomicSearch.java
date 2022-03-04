package com.practice.turing;

import java.util.*;
import java.util.stream.Collectors;
//https://en.wikipedia.org/wiki/Dichotomic_search
class DichotomicSearch {
    public static List<String> possibilities(String signals) {
        System.out.println(signals);
        return !signals.contains("?") ? withoutWildcard(signals) : withWildcard(signals);
    }

    public static Map<String, String> getCharsMap() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put(".", "E");
        map.put("-", "T");
        map.put("..", "I");
        map.put(".-", "A");
        map.put("-.", "N");
        map.put("--", "M");
        map.put("...", "S");
        map.put("..-", "U");
        map.put(".-.", "R");
        map.put(".--", "W");
        map.put("-..", "D");
        map.put("-.-", "K");
        map.put("--.", "G");
        map.put("---", "O");
        return map;
    }

    public static List<String> withoutWildcard(String signals) {
        String result = "";
        if (getCharsMap().containsKey(signals)) {
            result = getCharsMap().get(signals);
        }
        return Arrays.stream(result.split("")).collect(Collectors.toList());
    }

    public static List<String> withWildcard(String signals) {
        List<Integer> wildCardIndexes = null;
        String[] symbols = null;
        int lengthOfSignals = signals.length();
        if (lengthOfSignals == 1) {
            return Arrays.asList("E", "T");
        } else {
            wildCardIndexes = new ArrayList<>();
            symbols = signals.split("");
            for (int i = 0; i < signals.length(); i++) {
                if (!"?".equals(symbols[i])) {
                    wildCardIndexes.add(i);
                }
            }
        }
        Set<String> arr = new LinkedHashSet<>();
        int count = 0;
        for (Map.Entry<String, String> entry : getCharsMap().entrySet()) {
            if (entry.getKey().length() == lengthOfSignals) {
                boolean isValid = true;
                String[] mapSymbols = entry.getKey().split("");
                for (int idx : wildCardIndexes) {
                    if (!symbols[idx].equals(mapSymbols[idx])) {
                        isValid = false;
                    }
                }
                if (isValid) {
                    arr.add(entry.getValue());
                }
                count++;
            }
        }


        return arr.stream().collect(Collectors.toList());
    }
}