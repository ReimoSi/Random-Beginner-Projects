package com.reimos.randomprojects;

public class NegativePositiveOrZeroNumber {
    public static void main(String[] args) {
        //For checking if code works
        checkNumber(0);
        checkNumber(4);
        checkNumber(-3);
    }

    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
