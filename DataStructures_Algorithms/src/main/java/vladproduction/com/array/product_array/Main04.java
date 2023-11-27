package vladproduction.com.array.product_array;

public class Main04 {

    public static void main(String[] args) {
        int[] data = {5,-1,-4,-5,7,0, 10};
        Product product = new Product();
        int result = product.product(data);
        System.out.println("result="+result);
    }

}
