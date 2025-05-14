package com.reimos.randomprojects;

import java.util.Random;

public class RandomClassExample {

    public static void main(String[] args) {

        Random random = new Random(); //Like previously looked scanner

        int number1;
        int number2;
        int number3;
        double number4;
        boolean isHeads;

        number1 = random.nextInt(1, 6); //Origin is inclusive, Bound is exclusive
        number2 = random.nextInt(1, 6);
        number3 = random.nextInt(1, 6);
        number4 = random.nextDouble(1, 2);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(isHeads);

        if (isHeads){
            System.out.println("HEADS");
        }else {
            System.out.println("TAILS");
        }

    }
}
