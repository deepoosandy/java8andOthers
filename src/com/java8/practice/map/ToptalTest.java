package com.java8.practice.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ToptalTest {

    public static void main(String[] args) {
        Map<String, Integer> wayOffMap1 = new HashMap<>();
        Map<String, Integer> wayOffMap2 = new HashMap<>();
        int A[]={100, 100, 100, -10};
        String D[]={"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
        int amount = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            count = 1;
            int negValue = 0;
            if (value >= 0) {
                amount += value;
            } else {
                negValue = value;
            }
            String []keys=D[i].split("-");
            String key=keys[0]+keys[1];
            if (wayOffMap1.containsKey(key)) {
                int previousValue = wayOffMap1.get(key);
                negValue = negValue + previousValue;
                count++;
            }
            wayOffMap1.put(key, negValue);
            wayOffMap2.put(key, count);
        }
        int wayOffMonth = 0;
        int negativeAmount = 0;
        for (Map.Entry<String, Integer> set : wayOffMap1.entrySet()) {
            int value = wayOffMap1.get(set.getKey());
            int wayoffCount = wayOffMap2.get(set.getKey());
            negativeAmount += set.getValue();
            if (value >= 100 && wayoffCount >= 5) {

            }else if(value>=-100){
                wayOffMonth++;
            }
        }
        System.out.println(amount +negativeAmount - (5 * (12 - wayOffMonth)));
    }
}
