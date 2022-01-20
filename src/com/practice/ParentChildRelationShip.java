package com.practice;

public class ParentChildRelationShip {

    public static void main(String[] args) {
        String str="abcpqrabc";
        for(int i=0;i<str.length();i++){
            System.out.println(str.substring(i,i+1));
        }
    }

    public void add(String a){

    }
}
class Child extends ParentChildRelationShip{
    public void add(Integer a){

    }
}
