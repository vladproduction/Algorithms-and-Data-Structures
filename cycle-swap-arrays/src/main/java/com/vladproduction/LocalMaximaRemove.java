package com.vladproduction;

import java.util.Arrays;

/**
 * the updated implementation of the cycleSwap method that avoids explicit loops;
 * by leveraging Java's built-in methods, such as System.arraycopy() for copying elements
 * and Arrays.copyOf() for creating a temporary array;
 */
public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 7, 4};
        int shift = 2;

        cycleSwap(array);
        System.out.println(Arrays.toString(array)); // Output: [4, 1, 3, 2, 7]



        cycleSwap(array, shift);
        System.out.println(Arrays.toString(array)); // Output: [7, 4, 1, 3, 2]
    }

    static void cycleSwap(int[] array) {
        // If the array is null or has no elements, do nothing.
        if (array == null || array.length <= 1) {
            return;
        }

        // Create a new array to store the shifted values
        int[] result = new int[array.length];

        // Copy the last element to the first position
        result[0] = array[array.length - 1];

        // Copy the rest of the elements to the result array
        System.arraycopy(array, 0, result, 1, array.length - 1);

        // Copy the result back to the original array
        System.arraycopy(result, 0, array, 0, array.length);
    }


    static void cycleSwap(int[] array, int shift) {
        // If the array is null or has no elements, do nothing.
        if (array == null || array.length == 0) {
            return;
        }

        // Normalize the shift value
        int n = array.length;
        shift %= n; // In case shift is greater than the array length

        // If shift is 0, no need to change the array
        if (shift == 0) {
            return;
        }

        // Create new array for the result
        int[] result = new int[n];

        // Copy the last `shift` elements to the front
        System.arraycopy(array, n - shift, result, 0, shift);

        // Copy the rest of the elements from the original array
        System.arraycopy(array, 0, result, shift, n - shift);

        // Copy the result back to the original array
        System.arraycopy(result, 0, array, 0, n);
    }
}
