package com.all.possiblepermutations;

public class ReduceNumber {
    public static void main(String[] args) {
        System.out.println();
        int count=1;
        int number = largestPrimeDivisor(20);
        while(number!=0){

        }

    }

    public static int largestPrimeDivisor(int input) {
        int largestPrimeDivisor = 0;

        for (int i = 0; i < 9; i++) {

            if ((i & 1) != 0 && (input % i == 0)) {
                largestPrimeDivisor = i;
            }
        }
        return largestPrimeDivisor;
    }

}
