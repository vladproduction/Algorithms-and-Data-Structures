package vladproduction.com.array.binary_search_in_array.ch03_myPractice;

import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) {
        int [] data = {10,20,30,40,50,100,654};
        System.out.println(Arrays.toString(data));
        System.out.println("----------for------------------");
        for(int i=0;i<4;i++){
            System.out.println("i="+i);
        }
        System.out.println("---------while------------");
        int j=0;
        while (j<5){
            System.out.println("j="+j);
            j++;
            if (j==3){
                break;
            }
        }

        System.out.println("================");
        System.out.println();
        //automatic sort (by Java)
        System.out.println("------sort data[]----------");
        Arrays.sort(data);  //sort
        System.out.println(Arrays.toString(data));  //print after sort

        System.out.println("===================");
        System.out.println();
        Search_Methods search = new Search_Methods();//new instance from class with methods

        System.out.println("-----loop for---->");
        int digitIndex = search.linearSearchFor(data,20);//using method
        System.out.println("digitIndex="+digitIndex);//result of using method

        System.out.println("-----loop while---->");
        int digitIndex2 = search.linearSearchWhile(data,30);//method while
        System.out.println("digitIndex2="+digitIndex2);//print result

        System.out.println("-----loop binary Search_Methods---->");
        int binarySearch = search.binarySearch(data,100);
        System.out.println("binarySearch="+binarySearch);






    }
}
