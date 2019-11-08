/**
 * This class is created for generating odd numbers
 */
package com.epam;

/** OddNumber class
 * generate odd numbers
 */

public class OddNumber {
    /**
     * private variable
     *
     * minBound is a left border
     * maxBound is a right border
     */
    private int minBound;
    private int maxBound;
    final int usualMaxBound = 100;

    /**
     * empty constructor
     */
    public OddNumber() {
        this.minBound = 1;
        this.maxBound = usualMaxBound;
    }

    /**
     * Another constructor
     *
     * @param minBound left border
     * @param maxBound right border
     */

    public OddNumber(int minBound, int maxBound) {
        this.minBound = minBound;
        this.maxBound = maxBound;
    }


    /**
     * Method to get minBound
     *
     * @return minBound
     */
    public int getMinBound() {
        return minBound;
    }

    /**
     * Method to set minBound
     *
     * @param minBound - left border
     */

    public void setMinBound(int minBound) {
        this.minBound = minBound;
    }


    /**
     * Method to get maxBound
     *
     * @return maxBound
     */
    public int getMaxBound() {
        return maxBound;
    }

    /**
     * Method to set maxBound
     *
     * @param maxBound - right border
     */
    public void setMaxBound(int maxBound) {
        this.maxBound = maxBound;
    }

    /**
     * generate odd numbers
     *
     * from minBound to maxBound
     */

    public void getOddNumbersStraight() {
        for (int i = this.minBound; i <= this.maxBound; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * also generate odd numbers
     *
     * from minBound to maxBound
     * but printing reverse
     */


    public void getOddNumbersReverse() {
        for (int i = this.maxBound; i >= this.minBound; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * @return sum of all add numbers
     */
    public int getSum() {
        int sum = 0;
        for (int i = this.minBound; i <= this.maxBound; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * @return max number from all odd numbers
     */

    public int getMaxOddNumber() {
        int max;
        if (maxBound % 2 != 0) {
            max = maxBound;
        } else {
            max = maxBound - 1;
        }
        return max;
    }

}
