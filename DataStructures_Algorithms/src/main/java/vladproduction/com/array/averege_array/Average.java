package vladproduction.com.array.averege_array;

public class Average {   //1.amount; 2.sum; 3.avg
    public int amount(int [] data){
        int amount = 0;
        for (int i=0;i<data.length;i++)
            amount++;
        System.out.println("amount digits in array: "+amount);
        return amount;

    }
    public int sum(int [] data){
        int sum = 0;
        for (int i=0;i<data.length;i++)
            sum=sum+data[i];
        System.out.println("Total sum digits in array = "+sum);
        return sum;
    }

}
