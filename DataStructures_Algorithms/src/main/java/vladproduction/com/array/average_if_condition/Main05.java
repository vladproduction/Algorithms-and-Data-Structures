package vladproduction.com.array.average_if_condition;

import java.util.Arrays;

public class Main05 {
    public static void main(String[] args) {
        int data [] = {1,4,0,5,8,1,0,9,7,-8,0,5,-2,0,6,45,-8,10};
        System.out.println(Arrays.toString(data));
        AverageWithIfCondition averageWithIfCondition = new AverageWithIfCondition();
        averageWithIfCondition.avgIf(data);
    }
}
