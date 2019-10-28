package com.zipcodewilmington.assessment1.part1;

import java.util.Scanner;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer result = 0;
        for(Integer i = 0; i <= n; i++){
            result += i;
        }
        return result;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer result = 1;
        for(Integer i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int reversed = 0;
        while(val !=0){
           reversed = (reversed * 10) + (val % 10);
           val = val / 10;
        }
        return reversed;
    }
}
