package vladproduction.com.array.linearSearch;

import java.util.Arrays;

public class Main06 {
    public static void main(String[] args) {
        int [] data = new int[5];
        System.out.println(Arrays.toString(data));//{0,0,0,0,0}
        for (int i=0;i<data.length;i++){
            data[i]=i+1;
        }
        data=new int[]{1,5,9,7,12};
        System.out.println(Arrays.toString(data));//{1,2,3,4,5}
        LinearSearch linearSearch = new LinearSearch();
        int searchInd = linearSearch.findIndexNumber(data,7);
        System.out.println("searchInd="+searchInd);
        String [] words = new String[3];
        words[0]="Denis";
        words[1]="Sergej";
        words[2]="Vlad";
        int IndexWord = linearSearch.findIndexNumber(words,"Vlad");
        System.out.println(IndexWord);
    }
}
