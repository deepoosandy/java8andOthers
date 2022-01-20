package com.java8.practice.optional;

import java.util.*;

public class OptionalDemo{

    public static Map<String, String> getMap() {


        return map;
    }



   final  static
    Map<String, String>map=new HashMap<>();
    public static void main(String[] args) {

        int x=(int)(200/5);
        System.out.println("sandeep1q".substring(0, "sandeep1q".length()-1));
        String[] words = new String[10];

        Object obj=new Integer(10538);
        if(obj instanceof  Integer){
            System.out.println("In the Integer");
        }

       // Map<String, String> map=new HashMap<>();
        Map map2=new HashMap();

        map2=map;

        map2.put(1, 5);

       /* for(Map.Entry<String, String> x: map.entrySet()){
            System.out.println(x.getValue());
        }*/

        for(int i=0;i< 1000000;i++){
            map.put(i+"", i+"");
        }
        System.out.println(map.size());
             map.put(11+"", 12+"");
       //   Optional.of(null);
      //  Optional.of(words).get();
        //if specified value is null it will throw NullPointerException
        //System.out.println(Optional.of(words[0]));

        //if specified value is null it will give empty Optional Object
        System.out.println(Optional.ofNullable(words[0]));
        List<String> names=new ArrayList<>();

        /*Optional.ofNullable(names).orElse();
        Optional.ofNullable(names).orElseGet();
        Optional.ofNullable(names).orElseThrow()*/


        System.out.println();


    }
}