package com.practice;

public class FindTheHighestPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String input = arr[0];
        int count = 1;
        int proviousIndex = 0;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String string = input.substring(i, i + 1);
            if(count< arr.length){
                String arryElement= arr[count];
            }
        }

    }
}
