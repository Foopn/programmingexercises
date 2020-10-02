package kyh.lectures.lecture8;

import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        int a, b;
        String method;
        Calculator calc = new Calculator();
        System.out.println("Welcome to the Calculator!");
        Scanner sc = new Scanner(System.in);

        //Lägg till Modulo (%), Division (/), Max(max)
        while (sc.hasNext()) {
            a = sc.nextInt();
            method = sc.next();
            b = sc.nextInt();
            if (method.equals("+")) {
                System.out.println("The answer is: " + calc.add(a, b));
            } else if (method.equals("-")) {
                System.out.println("The answer is: " + calc.subtract(a, b));
            } else if (method.equals("*")) {
                System.out.println("The answer is: " + calc.multiply(a, b));
            } else {
                System.out.println("The method of calculation is not supported yet");
            }
        }
    }
}