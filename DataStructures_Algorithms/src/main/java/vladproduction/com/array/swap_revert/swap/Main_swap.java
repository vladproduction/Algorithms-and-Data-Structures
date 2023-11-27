package Swap_Revert.swap;

import java.util.Arrays;

public class Main_swap {

    public static void main(String[] args) {
        int[] data = {10,7,1,4,2,0};
        System.out.println(Arrays.toString(data));
//        swap(data, 2,5);
//        swap2(data, 2,5);
        swap3(data, 2,5);
        System.out.println(Arrays.toString(data));

    }


    public static void swap(int[] data, int i, int j){
        int a = data[i];
        int b = data[j];
        data[j] = a;
        data[i] = b;
    }

    public static void swap2(int[] data, int i, int j){
        int oldValue = data[j];
        data[j] = data[i];
        data[i] = oldValue;
    }

    public static void swap3(int[] data, int i, int j){
        //a=data[i];
        //b=data[j];
        System.out.println("--swap3 started--");
        data[i] = data[i]+data[j];
        data[j] = data[i]-data[j];
        data[i] = data[i]-data[j];
        System.out.println("--swap3 completed--");
        /*
        i=2;data[i] = 1
        j=5;data[j] = 0

        1) data[2] = data[2]+data[5]= 1+0 = 1
        [10, 7, 1, 4, 2, 0]

        2) data[5] = data[2] - data[5] = 1 - 0=1
        [10, 7, 1, 4, 2, 1]

        3) data[2] = data[2] - data[5] = 1 - 1 = 0
        [10, 7, 0, 4, 2, 1]
         */

        /*
        i=2;data[i] = 1
        j=5;data[j] = 0
        1) data[2] = data[2]+data[5]
        [10, 7, (1+0), 4, 2, 0]

        2) data[5] = data[2]-data[5] = (data[2]+data[5])-data[5] = data[2]
        [10, 7, (1+0), 4, 2, 1]

        3) data[2] = data[2] - data[5] = (data[2]+data[5]) - data[5] = (data[2]+data[5]) - data[2]= data[5]
        [10, 7, 0, 4, 2, 1]



         */


    }

}
