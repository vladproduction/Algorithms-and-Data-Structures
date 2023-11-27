package vladproduction.com.array.product_array;

public class Main03 {
    public static void main(String[] args) {
        int array [] = {2,4,1,0,2,4,1,0,2,10};//1280
        ProductExcept0 productExcept0 = new ProductExcept0();
        productExcept0.proEx0(array);
        int array2 [] = {-2,5,-2,4,3,4,-2,-1,-10};//-80
        ProductAllNegative productAllNegative = new ProductAllNegative();
        productAllNegative.calcNegative(array2);
        int array3 [] = {-2,2,-2,2,-10};//-160
        ProductTotal productTotal = new ProductTotal();
        productTotal.ProAll(array3);
    }
}
