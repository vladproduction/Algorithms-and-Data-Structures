package com.vladproduction.part3_binary_by_recursion;

/**
 * Created by vladproduction on 23-Mar-24
 */

import java.util.Arrays;

/**no loops*/
public class Searching_by_Recursion {
    public static void main(String[] args) {
        int [] arr = {1,-2,30,400,15,-6,77,188,-9};
        System.out.println(Arrays.toString(arr));

        System.out.println("sorting:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int target = 15;
        int low = arr[0];
        int high = arr.length; //todo: arr.length-1?
        System.out.println(high);
        System.out.println(searchingByRecursion(arr, target, low, high));
    }

    private static int searchingByRecursion(int[] arr, int target, int low, int high) {
        //1) Base case:
        if(low > high){
            return -1;
        }
        //2) Using recursion logic:
        int mid = low + (high - low) / 2;
        if (arr[mid] == target ){
            return mid;
        } else if (arr[mid] < target) {
            return searchingByRecursion(arr, target, mid + 1, high); //searching in te right half
        }else {
            return searchingByRecursion(arr, target, low, mid - 1); //searching in te left half
        }
    }
}
