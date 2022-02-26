package com.practice.turing;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterIndex {
    public static void main(String[] args) {
        System.out.println(new FirstNonRepeatingCharacterIndex().firstNonRepeatingCharacter(""));
    }

    public int firstNonRepeatingCharacter(String string) {
              if("".equals(string)) return -1;
        Map<String, Integer> map = Arrays.stream(string.split("")).collect(Collectors.toMap(x -> x, y -> 1, (a, b) -> a + b, LinkedHashMap::new));
        int index = 0;
        boolean flag = false;
        for (String str : string.split("")) {
            if (map.get(str) == 1) {
                flag=true;
                return index;
            }
            index++;
        }

        return flag ? index : -1;
    }
}
