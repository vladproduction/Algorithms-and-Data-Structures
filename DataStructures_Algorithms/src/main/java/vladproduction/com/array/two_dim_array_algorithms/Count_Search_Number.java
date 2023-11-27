package vladproduction.com.array.two_dim_array_algorithms;

import java.util.Arrays;

public class Count_Search_Number {
    public static void main(String[] args) {
        int [][] table = new int[3][];
        table[0] = new int[]{0,1,1,0,2,0,4};
        table[1] = new int[]{0,1,0,0,2,0,3};
        table[2] = new int[]{0,1,1,0,2,0};
        System.out.println(Arrays.deepToString(table));

        int amountSearchingNumber = countSearchNumb(table,4);
        System.out.println("Amount searching number in table="+amountSearchingNumber);
    }
    public static int countSearchNumb(int [][] table, int searchNumb){
        int total0 = 0;
        for (int i=0;i<table.length;i++){
            int [] subArray = table[i];
            int subArrays0=countSearchNumb(subArray,searchNumb);
            total0=total0+subArrays0;

        }

        return total0;
    }
    public static int countSearchNumb(int []data, int searchNumb){
        int count0 = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]==searchNumb){
                count0++;
            }
        }
        return count0;
    }
}
