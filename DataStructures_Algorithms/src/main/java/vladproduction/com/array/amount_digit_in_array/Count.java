package vladproduction.com.array.amount_digit_in_array;

import java.util.Arrays;

public class Count {
    public int search(int [] data, int digit){
        System.out.println(Arrays.toString(data));
        int howMuch4=0;
        for (int i=0;i<data.length;i++){
            if(data[i]==digit){
                howMuch4++;
            }
        }
        System.out.println("Digit<4> in array = "+howMuch4);
        return howMuch4;
    }
}
