package vladproduction.com.array.count_negative;

public class Count {

    public int findNegativeCount(int[] data){
        int count = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]<0){
                count++;
            }
        }
        return count;
    }

}
