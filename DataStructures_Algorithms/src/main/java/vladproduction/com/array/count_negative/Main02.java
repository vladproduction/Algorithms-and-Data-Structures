package vladproduction.com.array.count_negative;

public class Main02 {

    public static void main(String[] args) {
        int[] data = {2, 9, -4, 5, 1, 0, -55, -7};
        Count count = new Count();
        int negativeCount = count.findNegativeCount(data);
        System.out.println("negativeCount="+negativeCount);
    }

}
