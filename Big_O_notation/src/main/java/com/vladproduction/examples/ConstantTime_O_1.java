package com.vladproduction.examples;

/**
 * Created by vladproduction on 22-Mar-24
 */
/**Constant Time (O(1))
 This refers to algorithms where the execution time remains constant regardless of the input size*/
public class ConstantTime_O_1 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int index = 2;
        int element = getElement(arr, index);
        System.out.println("element = " + element);
    }

    /**This function retrieves an element at a specific index from an array.
     * The number of operations (array access and conditional check) remains constant irrespective of the array size.*/
    private static int getElement(int[] arr, int index) {
        if(index >= 0 && index < arr.length){
            return arr[index];
        }else {
            throw new IndexOutOfBoundsException();
        }
    }
}
