package vladproduction.com.array.sum_algorithm;

import java.util.Arrays;

public class SumPositiv {
    public int calcPositive(int [] array){
        System.out.println(Arrays.toString(array));
        int sum=0;
        for(int i=0;i<array.length;i++)
            if (array[i]>0){
                sum=sum+array[i];
            }
        System.out.println("Sum of positive digit="+sum);
        return sum;
    }
}
