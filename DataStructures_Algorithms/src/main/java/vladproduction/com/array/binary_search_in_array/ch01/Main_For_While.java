package vladproduction.com.array.binary_search_in_array.ch01;

public class Main_For_While {

    public static void main(String[] args) {
        System.out.println("---------------for---------------");
        for(int i=0;i<5;i++){
            System.out.println("i="+i);
            if(i==4){
                break;
            }
        }

        System.out.println("---------------while---------------");
        int i = 0;
        while(i<5){
            System.out.println("j="+i);
           i++;
            if(i==3){
                break;
            }
        }



    }

}
