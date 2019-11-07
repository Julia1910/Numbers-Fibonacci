package com.epam;

public class EvenNumber {

    private int minBound;
    private int maxBound;

    public EvenNumber(){
        this.minBound = 1;
        this.maxBound = 100;
    }

    public EvenNumber(int minBound, int maxBound){
        this.minBound = minBound;
        this.maxBound = maxBound;
    }

    public int getMinBound() {
        return minBound;
    }

    public void setMinBound(int minBound) {
        this.minBound = minBound;
    }

    public int getMaxBound() {
        return maxBound;
    }

    public void setMaxBound(int maxBound) {
        this.maxBound = maxBound;
    }

    public void getEvenNumbersStraight(){
        for (int i = this.minBound; i <= this.maxBound; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public void getEvenNumbersReverse(){
        for (int i = maxBound; i >= minBound; i--){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public int getSum(){
        int sum = 0;
        for (int i = minBound; i <= maxBound; i++){
            if (i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public int getMaxEventNumber(){
        int max;
        if (maxBound%2 ==0 ){
            max = maxBound;
        }
        else {
            max = maxBound-1;
        }
        return max;
    }



}
