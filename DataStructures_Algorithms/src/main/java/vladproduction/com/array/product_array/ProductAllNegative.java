package vladproduction.com.array.product_array;

import java.util.Arrays;

public class ProductAllNegative {
    public int calcNegative(int [] data){
        System.out.println(Arrays.toString(data));
        int res = 1;
        for (int i=0;i<data.length;i++){
            if(data[i]<0){
                res=res*data[i];
            }
        }
        System.out.println("Product all negative result = "+res);
        return res;
    }
}
