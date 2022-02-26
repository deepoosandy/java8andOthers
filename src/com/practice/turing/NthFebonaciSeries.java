package com.practice.turing;

public class NthFebonaciSeries {
    public static void main(String[] args) {
        int a=0; int b=1; int c=0;
        System.out.println(" "+c);

        for(int i=0;i< 4;i++){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }

}
