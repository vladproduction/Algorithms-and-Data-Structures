package vladproduction.com.array.two_dim_array_algorithms;

import java.util.Arrays;

public class Create_Array_sum {

    public static void main(String[] args) {
        int[] data = {0,1,2,3,4};
        data[0]=90;

        int[][] table = new int[4][];
        //int n = table.length;
        //table[0][0] = 10;
        System.out.println(Arrays.toString(table));
        table[0] = new int[5];
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[0][3] = 4;
        table[0][4] = 5;
        System.out.println(Arrays.deepToString(table));

        table[1] = new int[3];
        table[1][0] = 10;
        table[1][1] = 20;
        table[1][2] = 30;
        System.out.println(Arrays.deepToString(table));

        int[] a = {100, 200, 300, 400};
        table[2] = a;
        System.out.println(Arrays.deepToString(table));

        table[3] = new int[]{1000, 2000, 3000, 4000};
        System.out.println(Arrays.deepToString(table));

        System.out.println("------sum-----------");
        int sum = sum(table);
        System.out.println("sum="+sum);
        int sum2 = sum2(table);
        System.out.println("sum2="+sum2);
    }


    //loop
    //internal loop
    private static int sum2(int[][] table){
        int totalSum = 0;
        for(int i=0;i<table.length;i++){

            int[] subArray = table[i];
            for(int j=0;j<subArray.length;j++){
                int value = subArray[j];
                //int value2 = table[i][j];
                totalSum = totalSum+value;
            }
        }
        return totalSum;
    }

    private static int sum(int[][] table){
        int totalSum = 0;
        for(int i=0;i<table.length;i++){
            int[] data = table[i];
            int simpleSum = sum(data);
            totalSum = totalSum+simpleSum;
        }
        return totalSum;
    }

    private static int sum(int[] data){
        int sum = 0;
        for(int i=0;i<data.length;i++){
            sum = sum +data[i]; // f(int[])==simpleSum
        }
        return sum;
    }

}
