package com.all.possiblepermutations;

public class AllPossiblePermutationsOFABC {
    public static void main(String[] args) {
        for (int i = 0; i < "abc".length(); i++) {
            System.out.println(swapCharacters(i, i-1 , "abc"));
            System.out.println(swapCharacters(i, i + 1, "abc"));

        }

    }

    public static String swapCharacters(int index, int start, String inputString) {

        if (start > 0 && start < inputString.length()) {

            if (index > start) {
                //left swapping

                swapCharacters(index, start - 1, inputString);
            }
            if (index < start) {
                //right swapping

                swapCharacters(index, start + 1, inputString);
            }
            return swapString(index, start, inputString);
        }else if(start !=-1){
            return swapString(index, start, inputString);
        }
  return null;
    }

    public static String swapString(int i, int j, String a) {


        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        //Converting characters from array into single string
        return "" + b;
    }


}
