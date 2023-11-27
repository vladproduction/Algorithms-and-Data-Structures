package vladproduction.com.array.sum_array;

public class Main03 {

    public static void main(String[] args) {
        int[] data = {5,0,-1,-4,-5,7,8,10};
        Sum sum = new Sum();
        int sumPositive = sum.sumPositiveNumbers(data);
        System.out.println("sumPositive="+sumPositive);
        System.out.println("------sum-------------");
        int totalSum = sum.sum(data);
        System.out.println("totalSum="+totalSum);
    }

}
