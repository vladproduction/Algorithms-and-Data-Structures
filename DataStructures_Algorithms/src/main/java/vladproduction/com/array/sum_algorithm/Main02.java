package vladproduction.com.array.sum_algorithm;

public class Main02 {
    public static void main(String[] args) {
        int array[] = {1,-5,6,8,-10,4,2,1};
        SumPositiv sumPositiv = new SumPositiv();
        sumPositiv.calcPositive(array);
        SumNegative sumNegative = new SumNegative();
        sumNegative.calcNegative(array);
        SumTotal sumTotal = new SumTotal();
        sumTotal.calcTotal(array);
    }
}
