package com.practice;


//public class ParentWithStaticClass {
//    public static String name="Sandeep";
//}
//class ChildIShavingStatic extends ParentWithStaticClass{
//
//}
class Test{
    public static void main(String[] args) {
     //   System.out.println(ChildIShavingStatic.name);
    }
}
interface MyInterface{
    default void add(){
        System.out.println("in def");
    }
}