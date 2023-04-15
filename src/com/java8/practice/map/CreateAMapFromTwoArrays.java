/*
package com.java8.practice.map;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class CreateAMapFromTwoArrays {
    @Test
    public void q30339679(){

        List<Integer> p=Stream.of(1,2,3,4,5).collect(Collectors.toList());
        System.out.println(p);


        // days short name
        String[] shortNames = {"Wed","Thu", "Fri", "Mon", "Tue", "Sat","Sun"};
        Arrays.sort(shortNames);
     Map map=new TreeMap();
        // days long name
        String[] longNames = { "Monday", "Tuesday",  "Friday", "Saturday","Sunday","Wednesday", "Thursday"};
        Arrays.sort(longNames);
        Map<String, String> sorted = IntStream.range(0, shortNames.length).boxed().collect(Collectors.toMap(i -> shortNames[i], j -> longNames[j],
                (x, y) -> x + y, LinkedHashMap::new));
        String result="{Mon=Monday, Tue=Tuesday, Wed=Wednesday, Thu=Thursday, "
                + "Fri=Friday, Sat=Saturday, Sun=Sunday}";
        {
            System.out.println(result.equals(sorted.toString()));
        }
        assertEquals(result, sorted.toString());
    }

}
class  Employee{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
*/
