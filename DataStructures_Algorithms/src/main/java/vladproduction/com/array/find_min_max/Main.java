package vladproduction.com.array.find_min_max;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] data = {8,91,7,700,6,1,6,32};
        System.out.println(Arrays.toString(data));
        int maxNum = maxDigit(data);
        System.out.println("maxNum="+maxNum);
        int placeMaxNumber = placeDigit(data);
        System.out.println("placeMaxNumber="+placeMaxNumber);
        int placeMaxNumber2 = placeDigit2(data);
        System.out.println("placeMaxNumber2="+placeMaxNumber2);
    }
    public static int maxDigit(int []data){
        int max = data[0];
        for(int i=1;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }//O(n)

    public static int placeDigit(int []data){
        int max = maxDigit(data);
        int placeMax = -1;
        for(int i=0;i<data.length;i++){
            if(data[i]==max){
                placeMax=i;
            }
        }
        return placeMax;
    }//O(2n)

    public static int placeDigit2(int []data){
        int max = data[0];
        int place = -1;
        for(int i=1;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
                place=i;
            }
        }
        return place;
    }//O(n)
}
