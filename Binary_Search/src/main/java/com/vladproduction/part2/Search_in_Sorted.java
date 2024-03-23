package com.vladproduction.part2;

/**
 * Created by vladproduction on 23-Mar-24
 */

public class Search_in_Sorted {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int key = 7;

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
