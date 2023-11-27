package vladproduction.com.alphabetical;

public class Alpha {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        //alpha.printAll();
        alpha.printUpper();
        System.out.println();
        alpha.printLower();
    }

    public void printAll() {
        for (int i = 0; i < 256; i++) {
            System.out.println(i + " -> " + (char) i);
        }
    }

    public void printUpper() {
        System.out.println("printUpper: ");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i);
        }
    }
    public void printLower() {
        System.out.println("printLower: ");
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i);
        }
    }
}



