package vladproduction.sorting;

import java.util.Arrays;

public class Sorting_MAX {
    public static void main(String[] args) {
        int[] data = {1, 2, 0, 3, 552, 0, -3, 2, 10, 9};
        System.out.println("before sorting: " + Arrays.toString(data));

        sortMax(data);
        System.out.println("after sorting: " + Arrays.toString(data));
    }

    static void sortMax(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int max = data[i];
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > max) {
                    maxIndex = j;
                    max = data[j];
                }
            }
            if (maxIndex != i) {
                swap(data, i, maxIndex);
            }
        }
    }

    static void swap(int[] data, int i, int j) {
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
}
