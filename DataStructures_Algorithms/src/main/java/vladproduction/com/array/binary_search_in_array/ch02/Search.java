package vladproduction.com.array.binary_search_in_array.ch02;

public class Search {

    public int linearSearch(int[] data, int searchNumber){
        int searchIndex = -1;
        for(int i=0;i<data.length;i++){
            if(data[i]==searchNumber){
                searchIndex = i;
                break;
            }
        }
        return searchIndex;
    }

    public int linearSearch2(int[] data, int searchNumber){
        int searchIndex = -1;
        int i=0;
        while(i<data.length){
            if(data[i]==searchNumber){
                searchIndex = i;
                break;
            }
            i++;
        }
        return searchIndex;
    }

    public int binarySearch(int[] data, int searchNumber){
        int searchIndex=-1;
        int start = 0;
        int end = data.length-1;

        while(start<=end){
            int middleIndex = (start+end)/2;
            if(data[middleIndex]==searchNumber){
                searchIndex = middleIndex;
                break;
            }
            if(data[middleIndex]<searchNumber){
                start = middleIndex+1;
            } else{
                end = middleIndex-1;
            }
        }
        return searchIndex;
    }
}
