package vladproduction.com.array.averege_array;

public class Average02 {
    public int average(int [] data){
        int average = 0;
        int sum = 0;
        int count = 0;
        for(int i=0;i<data.length;i++)
            count++;
        for(int i=0;i<data.length;i++)
            sum=sum+data[i];
        average=sum/count;
        System.out.println("avg="+average);
        return average;
    }
}
