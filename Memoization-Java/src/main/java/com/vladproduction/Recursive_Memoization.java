package com.vladproduction;

import java.util.Arrays;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class Recursive_Memoization {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibNaive(n, mem));

    }

    private static long fibNaive(int n, long[] mem) {
        if(mem[n] != -1)
            return mem[n];
        if(n <= 1)
            return n;
        long res =  fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = res;
        return res;
    }
}
