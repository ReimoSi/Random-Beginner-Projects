package com.reimos.randomprojects;

import java.util.Scanner;

// EASY SHOPPING CART PROGRAM
public class ShoppingCartProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would You like to buy (pizza, hamburger, hot-dog): ");
        item = scanner.nextLine();

        System.out.print("What is the prize for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would You like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();

    }
}