/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noah
 */
import java.util.Scanner;
public class pchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;  // Numbers <= 1 are not prime
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) { // Loop from 2 to sqrt(num)
                    if (num % i == 0) {
                        isPrime = false;
                        break; // If divisible, no need to check further
                    }
                }
            }

            System.out.println(isPrime ? "Prime" : "Not Prime");
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
        scanner.close();
    }
}

