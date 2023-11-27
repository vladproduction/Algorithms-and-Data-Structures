package vladproduction.com.array.average_if_condition;

public class AverageWithIfCondition {
    public double avgIf(int[] data){
        double avg = 0.00;
        int count = 0;
        int sum=0;
        for(int i=0;i<data.length;i++){
            if(data[i]>0){
                count++;
            }
        }
        for (int i=0;i<data.length;i++){
            if(data[i]>0){
                sum=sum+data[i];
            }
        }
        avg=sum/count;
        System.out.println("Average digits except data[i]<0 = "+avg);
        System.out.println("Count="+count);
        System.out.println("Sum="+sum);
        return avg;
    }
}
