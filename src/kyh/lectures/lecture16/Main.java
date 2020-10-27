package kyh.lectures.lecture16;

import javax.swing.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int gnu = 5;


    void test() {







        int i = 2;
        switch(i) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Något annat");
        }
        System.out.println("Hello");
    }


    /**
     * Returns a value that is double of the input
     * @param input gets duplicated
     * @return
     */
    public int doubleValue(int input) {
        return input*2;
    }

    public void printToTerminal(String s) {
        System.out.println(s);
    }

    public void canSometimesGoWrong() throws IOException {
        throw (new IOException());
    }

    public void randomizeANumberAndPrintItToTerminal() {
        Random rand = new Random();
        int i = rand.nextInt();
        printToTerminal(String.valueOf(i));
    }

    public int getUserInput() {
        return Integer.valueOf(JOptionPane.showInputDialog("Skriv in en siffra"));
    }

    public int multiplyWithFive(int input) {
        return input*5;
    }

    public int doSomeStuff(int x, int y, int z) {
        int g = y+x;
        z+=g%y;
        while(y<x*z) {
            y++;z--;
        }
        return y/x*z;
    }


    public Main() {

    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(sc.next());
        }
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
        for(int element: array) {
            System.out.println(element);
        }


        /*Instrument instrument = new Drums();
        instrument.play(60, 500);
        instrument.getInstrument();*/
        /*cello.play(60, 500);
        cello.play(67, 500);
        cello.play(67, 500);
        cello.play(69, 500);
        cello.play(69, 500);
        cello.play(67, 700);*/
    }
}
