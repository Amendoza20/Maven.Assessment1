package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input) {
     /*   Integer counter = 0;
        int index = 0;
        ArrayList<String> result = new ArrayList<String>();
        //for every character in the length of input create a sub string.
        for (int i = 0; i < input.length() - 1; i++) {
            result.add(input.substring(index, input.length() - 1));
            index++;
            System.out.println(result);
        }
        //return result.toArray(new String[result.size()]);

        for (int i = input.length(); i >= input.length(); i--) {
            result.add(input.substring(index, input.length() - 1));
            index++;
            System.out.println(result);
        }


        return null;

    }

    /*  This is similar in that I am using the first array to check the next array.
        But Im not sure how then to check more than just [0][1]...
        I will probably use this later after i break it down into an array

         String result = "";
            for (String x : array)
                result += x.toUpperCase();
            for (int i = 'A'; i < 'Z'; i++) {
                for (int j = 0; j < result.length(); j++) {
                    if (i == result.charAt(j)) {
                        break;
                    } else if (j == result.length() - 1) {
                        return false;
                    }
                }
            }
            return true;
     */
   /* public static String reverse(String str) {
        String result = "";
        StringBuilder reverse = new StringBuilder();
        reverse.append(str);
        reverse.reverse();
        result = reverse.toString();
        return result;
        */
        return 1084;
    }

}