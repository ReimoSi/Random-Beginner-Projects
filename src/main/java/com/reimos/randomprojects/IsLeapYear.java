package com.reimos.randomprojects;

public class IsLeapYear {

    public static void main(String[] args) {

        System.out.println(isLeapYear(4));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
}
