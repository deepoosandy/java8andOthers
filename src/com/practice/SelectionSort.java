package com.practice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={8, 5, 2, 9, 5, 6, 3};

        for(int i=0;i< arr.length;i++){
            int smallest=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(smallest > arr[j]){
                    int temp=arr[j];
                    arr[j]=smallest;
                    smallest=temp;
                }
            }
            arr[i]=smallest;
        }
        System.out.println(arr);
    }
}
