package org.example;

import java.util.Scanner;

import static org.example.ArmstrongNumber.isArmstrong;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = scanner.nextInt(); // Read input from console

        boolean isArmstrong = isArmstrong(number);

        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close(); //
    }
}