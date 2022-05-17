package javaStarter.hw7.task2;

import java.util.Scanner;

public class Arithmetics {
    int res=0;
    int add (int a, int b){
        res = a + b;
        return res;
    }
    int sub (int a, int b){
        res = a - b;
        return res;
    }
    int mul (int a, int b){
        res = a * b;
        return res;
    }
    int div (int a, int b) {
        if (b == 0) System.out.println("Divisor cannot be zero.\nTry again: ");
        else
            res = a / b;
        return res;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Arithmetics arithmetics = new Arithmetics();
            System.out.println("\nCalculator of simple arithmetic operations");
            System.out.println("Enter the appropriate option to perform an arithmetic operation: + (addition)");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t - (subtraction) ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t * (multiplication)");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t / (division)");
            char arithmeticOperation = sc.next().charAt(0);
            System.out.println("Enter the numbers on which you want to perform selected arithmetic operation");
            System.out.print("a = ");
            int a = sc.nextInt();
            System.out.print("b = ");
            int b = sc.nextInt();
            switch (arithmeticOperation){
                case '+':
                    System.out.println("Result of arithmetic operation: " + a + " + " + b + " = " + arithmetics.add(a,b));
                    break;
                case '-':
                    System.out.println("Result of arithmetic operation: " + a + " - " + b + " = " + arithmetics.sub(a,b));
                    break;
                case '*':
                    System.out.println("Result of arithmetic operation: " + a + " * " + b + " = " + arithmetics.mul(a,b));
                    break;
                case '/':
                    System.out.println("Result of arithmetic operation: " + a + " / " + b + " = " + arithmetics.div(a,b));
                    break;
                default:
                    System.out.println("The dates you entered are not supported");
            }
        }
    }

