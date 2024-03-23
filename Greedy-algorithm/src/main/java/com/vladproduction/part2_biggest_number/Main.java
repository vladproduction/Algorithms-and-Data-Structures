package com.vladproduction.part2_biggest_number;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by vladproduction on 23-Mar-24
 */

public class Main {
    public static void main(String[] args) {
        int []  digits = {3,1,7,9,9,5};
//        int []  digits = {0,0,1,0,0,0};
        System.out.println(constructBiggestNumber_sorting_first(digits));
        System.out.println(constructBiggestNumber(digits));
        System.out.println(constructBiggestNumber_stream_action(digits));

    }

    private static String constructBiggestNumber_stream_action(int[] digits) {
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .toArray(String []::new));
    }

    private static String constructBiggestNumber(int[] digits) {
        //1.convert string for concatenation
        String [] digitsStr = new String[digits.length];
        for (int i = 0; i < digitsStr.length; i++) {
            digitsStr[i] = String.valueOf(digits[i]);
        }
        //2.custom comparator based on digit combination (handles leading zeros)
        Arrays.sort(digitsStr, (String a, String b) ->{
            String combined = a + b;
            String reversedCombined = b + a;
            return reversedCombined.compareTo(combined);
        });
        //3.build result
        StringBuilder sb = new StringBuilder();
        for (String s : digitsStr) {
            sb.append(s);
        }
        //4.Handle edge case of leading zeros (if all digits are zero)
        if(sb.toString().startsWith("0")){
            return "0";
        }
        return sb.toString();
    }
    /**Custom Comparator: A custom comparator function is defined using a lambda expression.
     * It takes two String arguments (a and b) and compares them based on their combined value.
     * However, the crucial difference is that it concatenates b and a first (reversed order) and compares that
     * with the normal concatenation (a + b). This ensures that combinations starting with a larger digit come first,
     * even if the trailing digits are smaller (e.g., "90" is considered bigger than "81").
     combined = a + b: Normal concatenation to create the standard combination.
     reversedCombined = b + a: Reversed concatenation to check for leading zeros.
     reversedCombined.compareTo(combined): Comparison based on reversed combination first. This ensures that "90"
     sorts before "81".*/

    private static String constructBiggestNumber_sorting_first(int[] digits) {
        //{3,1,7,9,9,5} --> {9,9,7,5,3,1}
        Arrays.sort(digits);
        String result = "";
        for (int i =  digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;
    }
}
