/**
 * This is a program for second homework
 *
 * Especially for Java Course Epam
 */

package com.epam;
import java.util.Scanner;

/**
 * This is a Main Class of program
 *
 * @author Kopytko Julia
 * @version 1.0
 */

public class MainProgram {

    /**
     * Printing odd and event number and also Fibonacci numbers
     *
     * @param args Just strings
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter min bound of numbers: ");
        int minBound = in.nextInt();
        System.out.println("Enter max bound of numbers: ");
        int maxBound = in.nextInt();
        OddNumber oddNumber = new OddNumber(minBound, maxBound);
        System.out.println("Odd numbers: ");
        oddNumber.getOddNumbersStraight();
        System.out.println("Sum of odd numbers: " + oddNumber.getSum());
        System.out.println("_____________________________ ");

        EvenNumber evenNumber = new EvenNumber(minBound, maxBound);
        System.out.println("Event numbers: ");
        evenNumber.getEvenNumbersReverse();
        System.out.println("Sum of event numbers: " + evenNumber.getSum());
        System.out.println("_______________________________");
        System.out.println("   ");

        System.out.println("Enter size of Fibonacci set: ");
        int n = in.nextInt();
        Fibonacci fibonacci = new Fibonacci(n, oddNumber.getMaxOddNumber(),
                evenNumber.getMaxEventNumber());
        fibonacci.getNumbers();
        System.out.println("Percentage of odd numbers:    "
                + fibonacci.getPercentageOdd() + "%");
        System.out.println("Percentage of event numbers:  "
                + fibonacci.getPercentageEvent() + "%");


    }
}
