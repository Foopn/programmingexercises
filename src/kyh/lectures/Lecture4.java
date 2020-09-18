package kyh.lectures;

import java.io.File;
import java.util.Scanner;

public class Lecture4 {


    public static void main(String[] args) {
        File file = new File("CJL.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
