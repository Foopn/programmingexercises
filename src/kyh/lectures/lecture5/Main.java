package kyh.lectures.lecture5;

import java.util.Scanner;

public class Main {
    public static void resetInt(MyInt i) {
        i.setInt(6);
    }

    public static String s2 = "Hej";

    public static void main(String[] args) {
        MyInt j = new MyInt(5);
        MyInt i = new MyInt(5);
        String s = "Hej";

        System.out.println(s2==s);


        /*Dog dog = new Dog("Axel", "Chihuahua");
        //System.out.println("Hunden heter " + dog.getName());
        //dog.bark();
        Dog dog2 = new Dog("Clemens", "Saint Bernard");
        //dog2.bark();
        dog.chase(dog2);*/
    }
}
