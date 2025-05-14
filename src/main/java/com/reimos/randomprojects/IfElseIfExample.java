package com.reimos.randomprojects;

import java.util.Scanner;

public class IfElseIfExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudnet;

        System.out.print("Enter Your name: ");
        name = scanner.nextLine();

        System.out.print("Enter Your age: ");
        age = scanner.nextInt();

        System.out.println("Are You are student (true/false): ");
        isStudnet = scanner.nextBoolean();

        //GROUP 1
        if (name.isEmpty()) {
            System.out.println("You didn't enter Your name");
        }else {
            System.out.println("Hello " + name + "!");
        }

        //GROUP 2
        if (age >= 65){
            System.out.println("You are a senior!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        }else {
            System.out.println("You are a child!");
        }

        //GROUP 3
        if (isStudnet) { //sama mis isStudent == true
            System.out.println("You are a student!");
        } else {
            System.out.println("You are NOT a student!");
        }

        scanner.close();
    }
}
