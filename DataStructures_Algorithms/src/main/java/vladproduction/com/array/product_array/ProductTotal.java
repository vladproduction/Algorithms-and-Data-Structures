package vladproduction.com.array.product_array;

import java.util.Arrays;

public class ProductTotal {
    public int ProAll(int [] data){
        System.out.println(Arrays.toString(data));
        int res = 1;
        for (int i=0;i<data.length;i++)
            res=res*data[i];
        System.out.println("Result of all digits in data[]= "+res);
        return res;
    }
}
