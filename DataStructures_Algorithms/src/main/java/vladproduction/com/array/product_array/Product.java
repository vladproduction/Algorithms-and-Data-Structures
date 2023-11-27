package vladproduction.com.array.product_array;

public class Product {

    public int product(int[] data){
        int product = 1;
        for(int i=0;i<data.length;i++){
            product = product * data[i];
        }
        return product;
    }

}
