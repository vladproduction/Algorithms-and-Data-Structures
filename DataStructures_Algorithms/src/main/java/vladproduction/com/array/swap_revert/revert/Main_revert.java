package Swap_Revert.revert;


import Swap_Revert.swap.Main_swap;
import java.util.Arrays;

public class Main_revert {

    public static void main(String[] args) {
        int[] data = {10,7,1,4,2,0};
        System.out.println("Before revert");
        System.out.println(Arrays.toString(data));
        revert(data);
        System.out.println("After revert");
        System.out.println(Arrays.toString(data));
    }

    public static void revert(int[] data){
        for(int i=0;i<data.length/2;i++){
            int j = data.length-1-i;
            Main_swap.swap3(data, i, j);
        }
    }
}
