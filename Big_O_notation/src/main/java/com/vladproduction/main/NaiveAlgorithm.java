package com.vladproduction.main;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class NaiveAlgorithm {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 45;
        System.out.println(fibNaive(n));
        long finish = System.currentTimeMillis();
        System.out.println("time fibNaive(" + n +"): " + (finish - start));
        /**1134903170
         time fibNaive(45): 3231*/
    }

    // O(2^n) - slow algorithm
    private static long fibNaive(int n){
        if(n <= 1){
            return n;
        }
        return fibNaive(n - 1) + fibNaive(n - 2);
    }
}
