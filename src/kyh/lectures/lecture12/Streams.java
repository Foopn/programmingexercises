package kyh.lectures.lecture12;

import java.util.ArrayList;

public class Streams {

    public static int adder(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("b1");
        strList.add("b2");
        strList.add("a1");
        strList.add("a2");
        strList.add("c1");
        strList.add("c2");

        System.out.println("Skriv ut i en foreach-loop");
        for (String elem: strList) {
            System.out.println(elem);
        }

        System.out.println("\nSkriv ut med en stream");
        strList
                .stream()
                .forEach(System.out::println);

        // ----------------------------------------------

        /* Filter */

        System.out.println("\nAlla element som börjar på c");
        strList
                .stream()  // Skapat en ström
                .filter(str -> str.startsWith("c"))  // Hitta alla element som börjar på c
                .forEach(System.out::println);

        System.out.println("\nAlla element som slutar på 2");
        strList
                .stream()
                .filter(str -> str.endsWith("2"))  // Hitta alla element som slutar på 2
                .forEach(System.out::println);

        // ----------------------------------------------

        /* Sorted */

        System.out.println("\nSortera");
        strList
                .stream()
                .sorted()
                .forEach(System.out::println);

        // ----------------------------------------------

        /* Map */

        System.out.println("\nGör alla strängar till versaler");
        strList
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Ny lista med heltal
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        // ----------------------------------------------
        // Fråga: hur skriver vi ut alla tal större än 3?

        System.out.println("\nAlla heltal större eller likamed 3");
        /* med en vanlig for-loop
        for (int i: intList) {
            if(i >= 3)
                System.out.println(i);
        }*/

        intList
                .stream()
                .filter(i -> i > 3)
                .forEach(System.out::println);

        // ----------------------------------------------
        // Map forts.

        System.out.println("\nMap-exempel");
        intList
                .stream()
                .mapToDouble(i -> i*2)
                .forEach(System.out::println);

        // ----------------------------------------------

        /* Reduce */

        System.out.println("\n Reduce: Summera en lista");
        intList
                .stream()
                .forEach(System.out::println);

        int sum = intList.stream().reduce(0, (a, b) -> a + b); // Lambda
        int sum2 = intList.stream().reduce(0, Integer::sum); // Inbyggd in Integer
        int sum3 = intList.stream().reduce(0, Streams::adder); // Egen funktion

        System.out.println("Summan är: " + sum + " " + sum2 + " " + sum3);
    }

}
