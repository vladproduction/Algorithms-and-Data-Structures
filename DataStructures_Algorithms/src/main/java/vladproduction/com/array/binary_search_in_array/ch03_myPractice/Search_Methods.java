package vladproduction.com.array.binary_search_in_array.ch03_myPractice;

public class Search_Methods {
    public  int linearSearchFor(int []data, int searchNum){
        int findIndex = -1;
        for(int i=0;i<data.length;i++){
            if(data[i]==searchNum){
                findIndex=i;
                break;
            }
        }
        return findIndex;
    }
    public int linearSearchWhile(int []data, int searchNum){
        int findIndex = -1;
        int j = 0;
        while(j<data.length){
            if(data[j]==searchNum){
                findIndex=j;
                break;
            }
            j++;
        }
        return findIndex;
    }
    public int binarySearch(int []data,int searchNumb){
        int searchIndex = -1;
        int start = 0;
        int end = data.length-1;
        while (start<end){
            int middleIndex = (start+end)/2;
            if(data[middleIndex]==searchNumb){
                searchIndex=middleIndex;
                break;
            }
            if(data[middleIndex]<searchNumb){
                start=middleIndex+1;
            }else {
                end=middleIndex-1;
            }
        }
        return searchIndex;
    }
}
