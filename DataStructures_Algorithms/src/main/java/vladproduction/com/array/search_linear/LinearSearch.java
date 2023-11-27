package vladproduction.com.array.search_linear;

public class LinearSearch {

    //O(1)
    //O(n)
    public int findIndexOfNumber(int[] data, int searchNumber){
        int n = data.length;
        int res = -1;
        for(int i=0;i<n;i++){
            if(data[i] == searchNumber){
                res = i;
                break;
            }
        }
        return res;
    }


}
