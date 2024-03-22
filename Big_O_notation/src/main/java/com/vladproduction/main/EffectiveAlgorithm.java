package com.vladproduction.main;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class EffectiveAlgorithm {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 45;
        System.out.println(fibEffective(n));

        long finish = System.currentTimeMillis();
        System.out.println("time fibEffective(" + n +"): " + (finish - start));
        /**1134903170
         time fibEffective(45): 0*/
    }

    // O(n) - effective
    private static long fibEffective(int n) {
        // O(n)
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        //n = 2 ==> 1 iterations
        //n = 3 ==> 2 iterations
        //n = 4 ==> 3 iterations

        // O(n + n) ==> O(2n) ==> O(n)
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

}
