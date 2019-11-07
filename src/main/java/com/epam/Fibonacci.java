package com.epam;

public class Fibonacci {
    private int f1;
    private int f2;
    private int n;
    public int[] array;

    public Fibonacci(){
        this.n = 10;
        this.f1 = 1;
        this.f2 = 1;
    }

    public Fibonacci(int n, int f1, int f2){
        this.n = n;
        this.f1 = f1;
        this.f2 = f2;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        n = n;
    }

    public void getNumbers(){
        array = new int[this.n];
        int i = 0;
        while (i < n){
            if (i == 0){
                array[0] = f1;
            }
            if (i == 1){
                array[1] = f2;
            }
            else if (i >= 2) {
                array[i] = array[i-1] + array[i-2];
            }
            i++;
        }
        for (int j =0; j < array.length; j ++){
            System.out.println(j+1 + ". " + array[j]);
        }

    }

    public double getPercentageOdd(){
        int amount = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i]%2 != 0){
                amount++;
            }
        }
        double percentageOdd = ((double)amount/n)*100;
        return percentageOdd;
    }

    public double getPercentageEvent(){
        int amount = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i]%2 == 0){
                amount++;
            }
        }
        double percentageEvent = ((double)amount/n)*100;
        return percentageEvent;
    }


}
