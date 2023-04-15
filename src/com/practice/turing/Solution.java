package com.practice.turing;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinimumDifference' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */

    public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
        
        List<Integer>result= new ArrayList<>();
        
        //if(a.size()==b.size()){
            for(int i=0;i<a.size();i++){
                String a1=a.get(i);
                String b1=b.get(i);
                 // System.out.println("a1 "+a1);
                 // System.out.println("b1 "+b1);
                if(a1.length()!=b1.length()){
                    result.add(-1);
                }else{
                    char[] aChars=a1.toCharArray();
                    char[] bChars=b1.toCharArray();
                    Arrays.sort(aChars);
                    Arrays.sort(bChars);
                    if(aChars.equals(bChars)){
                       result.add(0); 
                    }else{
                         int count=0;
                         
                         for(int k=0;k<aChars.length;k++)
                          {
                              if(b1.contains(String.valueOf(aChars[k]))){
                                  count++;
                              }
                          }
                          result.add(count);
                    }
                }
            }
       // }
    
    return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> b = IntStream.range(0, bCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.getMinimumDifference(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
