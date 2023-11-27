package vladproduction.com.array.product_array;

import java.util.Arrays;

public class ProductExcept0 {
    public int proEx0(int [] array){
        System.out.println(Arrays.toString(array));
        int res=1;
        for(int i=0;i<array.length;i++)
            if(array[i]>0){
                res=res*array[i];
            }
        System.out.println("Product all digits in array except 0 = "+res);
        return res;
    }
}
