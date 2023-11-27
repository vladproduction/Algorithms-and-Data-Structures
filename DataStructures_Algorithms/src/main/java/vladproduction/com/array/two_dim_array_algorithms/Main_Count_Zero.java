package vladproduction.com.array.two_dim_array_algorithms;

import java.util.Arrays;

public class Main_Count_Zero {
    public static void main(String[] args) {
    int [][] table = new int[3][];
    table[0] = new int[]{0,1,1,0,2,0,};
    table[1] = new int[]{0,1,0,0,2,0,};
    table[2] = new int[]{0,1,1,0,2,0};
    System.out.println(Arrays.deepToString(table));

    // variant 1_0
//  int amountZero = count0(table,0);
//  System.out.println("Amount 0 in table="+amountZero);
    // variant 2_0
    int amountZero = count0Type2(table);
        System.out.println("Amount 0 in table="+amountZero);
    }

    //variant 1_0
    public static int count0(int [][] table, int zero){
        int total0 = 0;
        for (int i=0;i<table.length;i++){
            int [] subArray = table[i];
            int subArrays0=count0(subArray,0);
            total0=total0+subArrays0;

        }

        return total0;
    }
    public static int count0(int []data, int z){
        int count0 = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]==z){
                count0++;
            }
        }
        return count0;
    }

    //variant 2_0
    public static int count0Type2(int [][] table){
        int total0 = 0;
        for (int i=0;i<table.length;i++){
            int [] subArray = table[i];
            int subArrays0=count0Type2(subArray);
            total0=total0+subArrays0;
        }
        return total0;
    }
    public static int count0Type2(int []data){
        int count0 = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]==0){
                count0++;
            }
        }
        return count0;
    }
}
