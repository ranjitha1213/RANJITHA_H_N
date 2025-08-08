package com.tandemloop;

import java.util.Scanner;

class Calculator {
    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "-":   
                System.out.println("Result: " + (a - b));
                break;
            case "*":    
                System.out.println("Result: " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation type.");
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter operation (+,-,*,/): ");
        String operation = sc.nextLine();

        // Create Calculator object
        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        sc.close();
    }
}
