package com.tandemloop;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Generate and print the series
        for (int i = 1; i <= num; i++) {
            System.out.print((2 * i - 1)); // Formula for odd number series
            
            // Add comma except after the last number
            if (i < num) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
