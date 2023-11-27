package vladproduction.sorting;

import java.util.Arrays;

public class Sorting_MIN {
    public static void main(String[] args) {
        int[] data = {1, 2, 0, 3, 552, 0, -3, 2, 10, 9};
        System.out.println("before sorting: " + Arrays.toString(data));
        sortMin(data);
        System.out.println("after sorting: " + Arrays.toString(data));
    }

    static void sortMin(int[] data) {
        for (int i = 0; i < data.length; i++){
            int min = data[i];
            int minIndex = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[j] < min){
                    minIndex = j;
                    min = data[j];
                }
            }
            if(minIndex!=i){
                swap(data,i,minIndex);
            }
        }
    }



    static void swap(int[] data, int i, int j) {
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
}
