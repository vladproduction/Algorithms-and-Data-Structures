package com.vladproduction.part2;

import java.util.Arrays;

/**
 * Created by vladproduction on 23-Mar-24
 */

public class Search_in_Not_Sorted {
    public static void main(String[] args) {

        int[] arr = {10,2,-3,400,51,16,74};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int key = 16;

        int search = binarySearchIndexByKey(arr, key);
        System.out.println(search);
    }
    private static int binarySearchIndexByKey(int [] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2; //for example {5,6,7} ==> 4+(6-4) / 2 = 4+1 = 5   -->index of '6'
            if(key < arr[mid]){
                high = mid - 1;
            }else if (key > arr[mid]){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
