package com.tandemloop;

import java.util.Scanner;

public class Program3 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        // Determine the maximum odd number to generate
        int num;
        if (a % 2 == 1) {  // if a is odd
            num = a * 2 - 1;
        } else {            // if a is even
            num = (a - 1) * 2 - 1;
        }
        
        // Generate and print the series
        for (int i = 1; i <= num; i += 2) {
            System.out.print(i);
            if (i < num) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}

