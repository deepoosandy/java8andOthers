package com.practice.turing;

import java.util.Arrays;

public class ThreeHighestNumberOfAnArrary {
    public static void main(String[] args) {
        int arr[]={141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        findThreeLargestNumbers(arr);
    }
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] arr= new int[3];
        Arrays.fill(arr,0);
        for(int i=0;i< array.length;i++){
            int input=array[i];

            if(arr[2]< input){
                arr[0]=arr[1];
                arr[1]=arr[2];
                arr[2]=input;
            }else if(arr[1]<input){
                arr[0]= arr[1];
                arr[1]=input;
            }else if(arr[0]< input){
                arr[0]=input;
            }

        }

        return arr;
    }
}
