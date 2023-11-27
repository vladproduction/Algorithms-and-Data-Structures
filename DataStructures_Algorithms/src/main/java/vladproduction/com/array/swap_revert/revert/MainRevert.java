package Swap_Revert.revert;


import Swap_Revert.swap.MainSwap;

import java.util.Arrays;

public class MainRevert {
    public static void main(String[] args) {
        int [] data = {10,5,6,4,11,0,8,7,9};
        System.out.println("before revert");
        System.out.println(Arrays.toString(data));
        MainRevert.revert(data);
        System.out.println("after revert");
        System.out.println(Arrays.toString(data));
    }
    public static void revert(int [] data){
        for(int i = 0;i<data.length/2;i++){ //start from [0]; until half of data[]; doing every step;
            //we can write also: int j = data.length-1-i; so in constructor we`ll use only j;

            MainSwap.swap3(data,i,data.length-1-i);//using our method swap, from other pack

        }
    }

}
