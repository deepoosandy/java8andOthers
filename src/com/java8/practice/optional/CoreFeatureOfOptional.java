package com.java8.practice.optional;

import java.util.Optional;

public class CoreFeatureOfOptional {
    public static void main(String[] args) {
        /*
        * Differene between Optional.of() And Optional.ofNullable()
        * */
        String str=null;
        //Difference 1
       // Optional.of(str); //  if given value is null throw NullPointerException
      // Optional.ofNullable(str); // if Given value is null it will not throw NullPointerException

        //Difference 2

        //if we call get()

    }
}
