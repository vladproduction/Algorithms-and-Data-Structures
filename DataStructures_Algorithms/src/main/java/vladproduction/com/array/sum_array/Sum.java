package vladproduction.com.array.sum_array;

public class Sum {

    public int sumPositiveNumbers(int[] data){
        int sum = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]>0){
                sum = sum + data[i];
            }
        }
        return sum;
    }

    public int sum(int[] data){
        int sum = 0;
        for(int i=0;i<data.length;i++){
            //int cellValue = data[i];
            //sum = sum +cellValue;
            sum = sum +data[i];
        }
        return sum;
    }

}
