package com.vladproduction;

import java.util.Arrays;

public class MainNoLoops {
    public static void main(String[] args) {
        {
            int[] array = new int[]{1, 3, 2, 7, 4};
            LocalMaximaRemove.cycleSwap(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{1, 3, 2, 7, 4};
            LocalMaximaRemove.cycleSwap(array, 2);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{1, 3, 2, 7, 4};
            LocalMaximaRemove.cycleSwap(array, 5);
            System.out.println(Arrays.toString(array));
        }
    }
}
