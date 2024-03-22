package com.vladproduction.examples;

/**
 * Created by vladproduction on 22-Mar-24
 */
/** Logarithmic Time (O(log n))
 This applies to algorithms where the execution time increases logarithmically with the input size
 (binary search)*/
public class LogarithmicTime_O_log_n {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int target = 3;

        int byTarget = binarySearchByTarget(arr, target);
        System.out.println("byIndex = " + byTarget);
    }

    /**Binary search repeatedly divides the search space in half, reducing the elements to consider
     * with each iteration. This results in logarithmic time complexity for finding an element in a sorted array.
     * explanation (Finding the Index):
     * The binary search specifically targets finding the index of the element within the array.
     * By comparing the target value with the middle element (arr[mid]) in each iteration, we determine the appropriate
     * half of the array to continue searching in. This process efficiently narrows down the search space and ultimately
     * leads to the target element's index if it exists in the array.
     * In conclusion, the binary search code effectively demonstrates how to find the index of an element within a sorted
     * array with logarithmic time complexity, making it a very efficient searching algorithm for large datasets.*/
    private static int binarySearchByTarget(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // target not found

    }
}
