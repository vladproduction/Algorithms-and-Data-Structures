package vladproduction.com.array.find_min_max;

public class MainMin {

    public static void main(String[] args) {
        int[] data = {5,1,0,-8,3,4, -7777};
        int minValue = findMin(data);
        System.out.println("minValue="+minValue);
        int minIndex = findIndexOfMin(data);
        System.out.println("minIndex="+minIndex);
        int minIndex2 = findIndexOfMin2(data);
        System.out.println("minIndex2="+minIndex2);
    }

    //O(n)
    public static int findMin(int[] data){
        int min = data[0];
        for(int i=1;i<data.length;i++){
            if(data[i]<min){
                min = data[i];
            }
        }
        return min;
    }

    //O(2n)
    public static int findIndexOfMin(int[] data){
        //O(n)
        int min = findMin(data);
        int minIndex = -1;
        //O(n)
        for(int i=0;i<data.length;i++){
            if(data[i]==min){
                minIndex = i;
                break;
            }
        }
        return minIndex;
    }

    //check min value and index
    //O(n)
    public static int findIndexOfMin2(int[] data){
        int min = data[0];
        int minIndex = 0;
        for(int i=1;i<data.length;i++){
            if(data[i]<min){
                min = data[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
