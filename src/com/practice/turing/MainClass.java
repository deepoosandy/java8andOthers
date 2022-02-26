package com.practice.turing;

public class MainClass {
    public static void main(String[] args) {
        Box obj1=new Box();
        obj1.heigths=1;
        obj1.width=1;
        obj1.length=2;
        Box obj2=new Box();
        obj2=obj1;
        System.out.println(obj2.heigths);
    }
}
class Box{
    int width;
    int heigths;
    int length;
}
