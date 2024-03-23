package com.vladproduction.part1;

/**
 * Created by vladproduction on 23-Mar-24
 */
/**in case we have already sorted array*/
public class Main01 {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 7, 10, 13, 18, 21};
        int target = 10;

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    private static int binarySearch(int[] numbers, int target){
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if(numbers[mid] == target)
                return mid; // Target found at index mid
            else if (numbers[mid] < target) {
                low = mid + 1; //Search in right half
            }else {
                high = mid - 1; //Search in left half
            }
        }
        return -1;
    }


}
