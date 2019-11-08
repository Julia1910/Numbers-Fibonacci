/**
 * This class is creating for generate event number
 */
package com.epam;

/**
 * EvenNumber Class
 * generate even numbers
 */

public class EvenNumber {

    /**
     * private variable
     *
     * minBound - left border
     * maxBound - left border
     */

    private int minBound;
    private int maxBound;
    final int usualMaxBound = 100;

    /**
     * empty constructor
     */

    public EvenNumber() {
        this.minBound = 1;
        this.maxBound = usualMaxBound;
    }

    /**
     * Another constructor
     *
     * @param minBound left border
     * @param maxBound right border
     */
    public EvenNumber(int minBound, int maxBound) {
        this.minBound = minBound;
        this.maxBound = maxBound;
    }

    /**
     * generate event numbers
     * from minBound to maxBound
     */
    public void getEvenNumbersStraight() {
        for (int i = this.minBound; i <= this.maxBound; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * generate event numbers
     * from minBound to maxBound
     * but printing reverse
     */

    public void getEvenNumbersReverse() {
        for (int i = maxBound; i >= minBound; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * @return sum of all event numbers
     */
    public int getSum() {
        int sum = 0;
        for (int i = minBound; i <= maxBound; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * @return max number from all event number
     */
    public int getMaxEventNumber() {
        int max;
        if (maxBound % 2 == 0) {
            max = maxBound;
        } else {
            max = maxBound - 1;
        }
        return max;
    }



}
