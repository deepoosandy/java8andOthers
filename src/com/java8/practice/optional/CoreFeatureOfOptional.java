package com.java8.practice.optional;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
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

        //Optional.of(str).get();  //--> Exception in thread "main" java.lang.NullPointerException
        //if we call get() on optional created using of() and value is null, it will throw NullPointerException
        //Optional.ofNullable(str).get(); //---> Exception in thread "main" java.util.NoSuchElementException: No value present
        //But if we call get() on the optional created using ofNullable() and value is null, it will throw NoSuchElementException

        System.out.println(Optional.ofNullable(null).orElse("sandeep")); ;
        System.out.println(Optional.ofNullable(null).orElseGet(HashSet::new));

    }
}
