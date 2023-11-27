package Selection_Sort.sort_Min_Max;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {3,1,-66,7,-10};
        int[] data2 = {1,15,-3,0,55,4};

        System.out.println("Before");
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data2));

        sortMin_Max(data); //[-66, -10, 1, 3, 7]
        sortMax_Min(data2); //[55, 15, 4, 1, 0, -3]

        System.out.println("After");
        System.out.println("sortMin_Max: "+Arrays.toString(data));
        System.out.println("sortMax_Min: "+Arrays.toString(data2));

    }


    public static void sortMin_Max(int[] data){
        for(int i=0;i<data.length;i++){
            int min = data[i];
            int minIndex = i;
            for(int j = i+1;j<data.length;j++){
                if(data[j]<min){
                    minIndex = j;
                    min=data[j];
                }
            }
            if(minIndex!=i){
                swap(data, i, minIndex);
            }
        }
    }

    public static void sortMax_Min(int [] data){
        for(int i=0;i< data.length;i++){
            int max = data[i];
            int maxIndex = i;
            for(int j=i+1; j<data.length;j++){
                if(data[j]>max){
                    maxIndex=j;
                    max=data[j];
                }
            }
            if(maxIndex!=i){
                swap(data,i,maxIndex);
            }
        }
    }

    private static void swap(int[] data, int i , int j){
        data[i] = data[i]+data[j];
        data[j] = data[i]-data[j];
        data[i] = data[i]-data[j];
    }
}
