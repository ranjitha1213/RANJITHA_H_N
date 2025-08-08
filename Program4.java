package com.tandemloop;

import java.util.HashMap;
import java.util.Map;

public class Program4 {

    public static void main(String[] args) {
        // Input array of numbers
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        
        // Create a result map with counts initialized to 0
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count multiples for each number
        for (int num : numbers) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (num % divisor == 0) {
                    result.put(divisor, result.get(divisor) + 1);
                }
            }
        }

        // Print the results
        System.out.println(result);
    }
}
