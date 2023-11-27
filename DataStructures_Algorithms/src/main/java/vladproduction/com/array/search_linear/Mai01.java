package vladproduction.com.array.search_linear;

import java.util.Arrays;

public class Mai01 {

    public static void main(String[] args) {
        int[] data = new int[10];
        System.out.println("-----------simple ---------------");
        System.out.println(data);
        String text = data+"";
        System.out.println("-----------Arrays.toString()---------------");
        System.out.println(Arrays.toString(data));
        String text2 = Arrays.toString(data);
        System.out.println("--------------------------------------");
        //data[0] = 8;
        //data[1] = -3;
        //data[2] = 4;

        //int n = data.length;
        for(int i=0;i<data.length;i++){
            data[i] = i;
        }
        System.out.println(Arrays.toString(data));
        System.out.println("------------Linear search----------------");
        int searchNumber = 9;
        LinearSearch linearSearch = new LinearSearch();
        int searchIndex = linearSearch.findIndexOfNumber(data, searchNumber);
        System.out.println("searchIndex="+searchIndex);



    }
}
