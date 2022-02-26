package com.practice;

import java.util.Arrays;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        NGE nge = new NGE();
        int[] arr = {4, 3, 1};
        if (Arrays.equals(nge.nge(arr), new int[]{-1, -1, -1})) {
            System.out.println(true);
        }
        if (Arrays.equals(nge.nge(new int[]{1,2,3,4}), new int[]{2,3,4,-1})) {
            System.out.println(true);
        }

        if (Arrays.equals(nge.nge(new int[]{1,1,3,4}), new int[]{3,3,4,-1})) {
            System.out.println(true);
        }
    }

    int[] nge(int arr[]) {
        int result[] = new int[arr.length];
       
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            //while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
            if(!stack.isEmpty() &&  arr[stack.peek()] < arr[i])
                result[stack.pop()] = arr[i];
            //}
            stack.push(i);
        }

        return result;
    }
}
