package com.vladproduction;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class Main01_slow {
    public static void main(String[] args) {
        //slow motion:
        System.out.println(fibNaive(3));
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));
        //if we want 100, this type of slow algorithm will work over 50_000 years;

    }

    private static long fibNaive(int n){
        if(n <= 1){
            return n;
        }
        return fibNaive(n - 1) + fibNaive(n - 2);

    }
}
