package vladproduction.com.array.sum_algorithm;


import java.util.Arrays;

public class SumTotal {
    public int calcTotal(int [] array){
        System.out.println(Arrays.toString(array));
        int total=0;
        for (int i=0;i<array.length;i++){
            total=total+array[i];
        }

        System.out.println("Sum of total digit="+total);
        return total;
    }
}
