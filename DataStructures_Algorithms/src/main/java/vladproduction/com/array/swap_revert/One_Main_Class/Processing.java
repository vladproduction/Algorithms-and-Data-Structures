package Swap_Revert.One_Main_Class;

import java.util.Arrays;

public class Processing {
    public static void main(String[] args) {

        int [] arrayA = {2,3,4,5,6};
        //System.out.println(arrayA.length-1);
        System.out.println(Arrays.toString(arrayA));
        //System.out.println("swapData(arrayA)-->");
        //swapData(arrayA,0,4);
        //System.out.println("revertData(arrayA)-->");
        revertData(arrayA);
        System.out.println(Arrays.toString(arrayA));

    }

    private static void swapData(int[] array, int a, int b){
        array[a] = array[a] + array[b];
        array[b] = array[a] - array[b];
        array[a] = array[a] - array[b];
    }

    private static void revertData(int[] array){
        for(int i=0;i< array.length/2;i++){
            int j = array.length-1-i;
            swapData(array,i,j);
        }
    }
}
