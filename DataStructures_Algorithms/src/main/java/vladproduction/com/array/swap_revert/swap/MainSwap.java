package Swap_Revert.swap;

import java.util.Arrays;

public class MainSwap {
    public static void main(String[] args) {
        int data [] = {100,2,45,13,0,89,11,6,77};
        System.out.println("swap:");
        System.out.println(Arrays.toString(data));
        MainSwap.swap(data,0,8);
        System.out.println("after swap");
        System.out.println(Arrays.toString(data));
        System.out.println();

        System.out.println("swap2:");
        System.out.println("after swap2");
        MainSwap.swap2(data,0,8);
        System.out.println(Arrays.toString(data));
        System.out.println();

        System.out.println("swap3:");
        System.out.println("after swap3");
        MainSwap.swap3(data,0,8);
        System.out.println(Arrays.toString(data));
        System.out.println();

        System.out.println("---------new Array------------");
        int [] data2 = {5,12,4,9,6,15};
        System.out.println(Arrays.toString(data2)); //just check if it`s work for another
        MainSwap.swap3(data2,0,5);
        System.out.println("after swap3");
        System.out.println(Arrays.toString(data2));
        System.out.println("For new array swap done");

    }
    public static void swap(int [] data,int i, int j){
        int a = data[i]; //we are replace for [0] and [8], counting starts from 0
        int b = data[j];
        data[j]=a;
        data[i]=b;

    }

    public static void swap2(int [] data, int i, int j){
        int oldValue = data[j]; //doing the same, but remembering only one
        data[j]=data[i];        //instead two variables
        data[i]=oldValue;
    }

    public static void swap3(int [] data, int i, int j){
        //in that method we steel want to replace our 0-->8
        //but using sum and two minus operations (color example!)
        data[i]=data[i]+data[j];//177=100+77
        data[j]=data[i]-data[j];//100=177-77   --->data[j]=100
        data[i]=data[i]-data[j];//77=177-100   --->data[i]=77
    }
}
