package com.practice;

import java.util.*;

class Program {
	public static void main(String[] args) {
		int[] arr={-4,-3,-2,1,5};
		new Program().sortedSquaredArray(arr);
	}
  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		int start=0;
		int end=array.length - 1;
		int arr[]=new int[array.length];
		int idx=end;
		 while(idx>=0){
			 if(Math.abs(array[start]) > Math.abs(array[end])){
				   int square=array[start] * array[start] ;
				    arr[idx]=square;
				 
				 start++;
			 }else{
				 int square=array[end] * array[end] ;
				  arr[idx]=square;
				  end--;
			 }
			 idx--;
		 }
    return arr;
  }
}
