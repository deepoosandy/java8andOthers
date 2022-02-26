package com.practice.turing;

public class RotatingStringCharcter {
    public static void main(String[] args) {
        String x = "ovmqkwtujqmfkao";
        int k = 52;
        String str = "";
        int z = 'z';

        for (int i = 0; i < x.length(); i++) {

            int intValue = x.charAt(i);
            intValue = intValue + k;

            if(intValue <= 122){
                intValue=intValue;
            }else{
                intValue= 96+ (intValue % 122);
            }

            char charValue = (char) (intValue);
            str = str + charValue;

        }
        System.out.println(str);
    }
}
