package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer counter = 0;
        String index[] = input.split(" ", input.length());
        for (int i = 0; i < input.length(); i++) {
            if (index[i].equals(index[(index.length - 1) - i])) {
                counter++;
            }
        }
            return counter;
        }

}