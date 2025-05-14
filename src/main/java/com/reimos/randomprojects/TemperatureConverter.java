package com.reimos.randomprojects;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        //Temperature converter from celsius to fahrenheit

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
