/**
 * This class is creating for generate Fibonacci numbers
 */
package com.epam;

/**
 * Fibonacci class generate
 * set of Fibonacci numbers
 */

public class Fibonacci {
    /**
     * private variable
     *
     * f1 - first number
     * f2 - second number
     * n - size of set
     */

    private int f1;
    private int f2;
    private int n;
    public int[] array;
    final int usualSize = 10;
    final int percent = 100;

    /**
     * empty constructor
     */
    public Fibonacci() {
        this.n = usualSize;
        this.f1 = 1;
        this.f2 = 1;
    }

    /**
     * Another constructor
     *
     * @param n size of set
     * @param f1 first number
     * @param f2 second number
     */

    public Fibonacci(int n, int f1, int f2) {
        this.n = n;
        this.f1 = f1;
        this.f2 = f2;
    }

    /**
     * generate Fibonacci numbers
     */

    public void getNumbers() {
        array = new int[this.n];
        int i = 0;
        while (i < n) {
            if (i == 0) {
                array[0] = f1;
            }
            if (i == 1) {
                array[1] = f2;
            } else if (i >= 2) {
                array[i] = array[i - 1] + array[i - 2];
            }
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(j + 1 + ". " + array[j]);
        }

    }

    /**
     * Method to get percentage of odd numbers
     *
     * @return percentage of odd numbers
     * in Fibonacci numbers
     */
    public double getPercentageOdd() {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                amount++;
            }
        }
        double percentageOdd = ((double) amount / n) * percent;
        return percentageOdd;
    }

    /**
     * Method to get percentage of event numbers
     *
     * @return percentage of event numbers
     * in Fibonacci numbers
     */
    public double getPercentageEvent() {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                amount++;
            }
        }
        double percentageEvent = ((double) amount / n) * percent;
        return percentageEvent;
    }

}
