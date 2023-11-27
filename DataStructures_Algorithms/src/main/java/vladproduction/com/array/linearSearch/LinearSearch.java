package vladproduction.com.array.linearSearch;

public class LinearSearch {
    public int findIndexNumber(int [] data, int searchNumb){
        int numberInd = -1;
        for(int i=0;i<data.length;i++){
            if(data[i]==searchNumb){
                numberInd=i;
                break;
            }
        }
        System.out.println("number= "+numberInd);
        return numberInd;
    }
    public int findIndexNumber(String [] data, String searchWord){
        int index = -1;
        for(int i=0;i<data.length;i++){
            if(data[i].equals(searchWord)){
                index=i;
                break;
            }
        }return index;
    }
}
