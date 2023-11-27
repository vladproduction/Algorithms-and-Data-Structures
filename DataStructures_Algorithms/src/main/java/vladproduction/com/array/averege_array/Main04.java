package vladproduction.com.array.averege_array;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {

        //Average
        int [] data = {1,2,3,4,5,6,7,8,9,55};
        System.out.println(Arrays.toString(data));
        Average average = new Average();
        average.amount(data);
        average.sum(data);
        int avg = average.sum(data)/average.amount(data);
        System.out.println("avg="+avg);


        //Average02
        System.out.println("---------------(sum+count)inside avg---------------------------");
        int [] data2 = {3,2,5,-8,15,22,1,16,-7,-2,-3,14};
        System.out.println(Arrays.toString(data2));
        Average02 average2 = new Average02();
        average2.average(data2);








    }

}
