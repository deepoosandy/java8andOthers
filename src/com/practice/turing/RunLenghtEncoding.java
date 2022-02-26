package com.practice.turing;

public class RunLenghtEncoding {
    public static void main(String[] args) {
        System.out.println(runLengthEncodedString("AAAAAAAAAAAAABBCCCCDD"));
    }

    public static String runLengthEncodedString(String string) {
        String previous = "";
        StringBuilder finalString = new StringBuilder();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            String str = string.substring(i, i + 1);
            if (!previous.equals(str)&& i!=0  ) {
                finalString.append(count).append(previous);
                count = 0;
            }
            if(count==10){
                count = count-1;
                finalString.append(count).append(previous);
                count=1;
            }
            count++;
            previous = str;
        }
        return finalString.append(count).append(previous).toString();
    }

}
