package com.practice;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input="abcdcbaa";
        int j=input.length()-1;
        boolean flag=true;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=input.charAt(j)){
                flag=false;
            }
            j--;
        }
        System.out.println(flag);
    }
}
