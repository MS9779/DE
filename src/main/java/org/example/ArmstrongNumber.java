package org.example;

public class ArmstrongNumber {
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int digitCount = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += Math.pow(digit, digitCount); // Add digit^digitCount to sum
            number /= 10; // Remove the last digit
        }

        return sum == originalNumber;
    }
}