package javaStarter.hw4.task2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 64;
        int operand2 = 16;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please please enter a character to perform an arithmetic operation: ");
        String arithmeticOperations = sc.next();// char arithmeticOperations = sc.next().charAt(0);


        switch (arithmeticOperations){
            case "+":
                sum += operand1 + operand2;
                System.out.println("The result of the arithmetic operation is " + sum);
                break;
            case "-":
                sum += operand1 - operand2;
                System.out.println("The result of the arithmetic operation is " + sum);
                break;
            case "*":
                sum += operand1 * operand2;
                System.out.println("The result of the arithmetic operation is " + sum);
                break;
            case "/":
                sum += operand1 / operand2;
                System.out.println("The result of the arithmetic operation is " + sum);
                break;
            case "%":
                sum += operand1 % operand2;
                System.out.println("The result of the arithmetic operation is " + sum);
                break;
            default:
                System.out.println("Character not recognized");
        }

    }
}
