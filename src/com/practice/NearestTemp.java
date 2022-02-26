package com.practice;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NearestTemp {

    public static void main(String[] args) {
        int[] arrTemp = {23, 34, 56, 49, 89};
        int averageTemp = 28;
        // string startdate= 01-Jan-2022

        LocalDate date = LocalDate.of(2022, 01, 01);

        Map<LocalDate, Integer> map = new HashMap<>();
         int close=0;
        for (int i = 0; i < arrTemp.length; i++) {
            int diff = Math.abs(28 - arrTemp[i]);

            map.put(date.plusDays(i), diff);
        }

        System.out.println(map);





    }
}
