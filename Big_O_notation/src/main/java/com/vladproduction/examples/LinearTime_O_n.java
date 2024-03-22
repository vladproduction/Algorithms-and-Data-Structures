package com.vladproduction.examples;

/**
 * Created by vladproduction on 22-Mar-24
 */
/**Linear Time (O(n))
 This indicates algorithms where the execution time grows linearly with the input size (n)*/
public class LinearTime_O_n {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int sum = findSum(arr);
        System.out.println("sum = " + sum);

    }

    /**This function iterates through each element of the array arr and adds it to the sum variable.
     * As the array size increases, the loop iterates more times, hence the linear time complexity.*/
    private static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}
