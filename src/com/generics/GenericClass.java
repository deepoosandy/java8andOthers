package com.generics;

public class GenericClass <T>{

    private Test str;

    GenericClass(Test str){
        this.str=str;
    }

    public Test getStr(){
        return str;
    }

    public static void main(String[] args) {
        GenericClass<Test> m= new GenericClass<>(new Test());
        System.out.println(m.getStr());
    }

}
