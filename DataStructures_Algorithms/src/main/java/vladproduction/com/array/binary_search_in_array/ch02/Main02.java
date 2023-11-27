package vladproduction.com.array.binary_search_in_array.ch02;

import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 10, 2};
        Search search = new Search();
        int searchIndex = search.linearSearch(data, 2);
        System.out.println(Arrays.toString(data) + "; searchIndex=" + searchIndex);
        System.out.println("--------Merge sort--> Arrays.sort()---------");
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

//        data = new int[]{10,7,5,3,2,1};
        System.out.println(Arrays.toString(data));
        int res = search.binarySearch(data, 10);
        System.out.println("res="+res);

    }

}
