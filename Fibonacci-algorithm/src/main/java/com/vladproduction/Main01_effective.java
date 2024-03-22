package com.vladproduction;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class Main01_effective {
    public static void main(String[] args) {

        System.out.println(fibEffective(3));
        System.out.println(fibEffective(5));
        System.out.println(fibEffective(10));
        System.out.println(fibEffective(50));
        System.out.println(fibEffective(100));
        System.out.println(fibEffective(1_000));
        System.out.println(fibEffective(10_000));


    }

    private static long fibEffective(int n){
       long [] arr = new long [n + 1];

       arr[0] = 0;
       arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];

    }
}
