package com.reimos.randomprojects;

public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(10, 15, 45));
        System.out.println(hasTeen(32, 41, 55));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {

        if (isTeen(num1) || isTeen(num2) || isTeen(num3)) {
            return true;
        }
        return false;

    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}
