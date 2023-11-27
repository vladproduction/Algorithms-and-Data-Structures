package Recursion;

import java.io.File;
import java.util.List;

public class Recursion_Runner {

    public static void main(String[] args) {
        Recursion_example fileSearcher = new Recursion_example();
        File directory = new File("D:\\Content");
        List<File> resultList = fileSearcher.findFiles(directory, ".txt");
        System.out.println("--------result---------------");
        System.out.println("size=" + resultList.size());
        for (File fileItem : resultList) {
            System.out.println(fileItem);
        }
    }
}
