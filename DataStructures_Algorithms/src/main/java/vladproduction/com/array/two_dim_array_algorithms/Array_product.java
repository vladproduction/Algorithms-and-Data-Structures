package vladproduction.com.array.two_dim_array_algorithms;

import java.util.Arrays;

public class Array_product {

    public static void main(String[] args) {
        int [][] table = new int[3][];
        table[0]  = new int[]{1, 2, 3};
        table[1] = new int []{10, 2};
        table[2] = new int []{2, 1};
        System.out.println(Arrays.deepToString(table));
        int productAll = product2(table);
        System.out.println("totalProduct="+productAll);

    }
    public static int product1(int [] data){
        int product = 1;
        for(int i=0;i<data.length;i++){
            product = product*data[i];
        }
        return product;
    }
    public static int product2(int [][] table){
        int totalProd = 1;
        for(int i=0;i<table.length;i++){
            int [] subArray = table[i];
            int simpleProd = product1(subArray);
            totalProd=totalProd*simpleProd;
        }
        return totalProd;
    }
}
