package com.reimos.randomprojects;

public class MethodOverLoading {

    public static final double ONE_INCH_IN_CM = 2.54;
    public static final int ONE_FOOT_IN_INCHES = 12;

    public static void main(String[] args) {

        System.out.println("Height in inches converted to centimeters: "
                            + convertToCentimeters(5) + " cm");
        System.out.println("Height in feet and inches converted to centimeters: "
                            + convertToCentimeters(10, 5) + " cm");
    }

    public static double convertToCentimeters(int heightInInches) {

        return heightInInches * ONE_INCH_IN_CM;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {

        int totalInches = (heightInFeet * ONE_FOOT_IN_INCHES) + remainingHeightInInches;
        return convertToCentimeters(totalInches);
    }
}
