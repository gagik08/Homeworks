package javaEssential.hw7.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DivideByZeroException {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
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
                System.out.println("Result of arithmetic operation: " + a + " + " + b + " = " + calculator.add(a,b));
                break;
            case '-':
                System.out.println("Result of arithmetic operation: " + a + " - " + b + " = " + calculator.sub(a,b));
                break;
            case '*':
                System.out.println("Result of arithmetic operation: " + a + " * " + b + " = " + calculator.mul(a,b));
                break;
            case '/':
                while (true) {
                    try {
                        if (b == 0) throw new DivideByZeroException();
                        double temp = calculator.div(a,b);
                        System.out.println("Result of arithmetic operation: " + a + " / " + b + " = " + temp);
                        break;
                    } catch (ArithmeticException ex) {
                        System.out.println("Divisor cannot be zero.\nTry again: ");
                        System.out.print("b = ");
                        b = sc.nextInt();
                        continue;
                    }
                    catch (DivideByZeroException ex1){
                        System.out.println("Divisor cannot be zero.\nTry again: ");
                        System.out.print("b = ");
                        b = sc.nextInt();
                        continue;
                    }
                }
            default:
                System.out.println("The dates you entered are not supported");
        }
    }
}
