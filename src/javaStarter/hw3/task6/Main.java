package javaStarter.hw3.task6;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 15;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = a / b;
        int modulus = a % b;
        System.out.println( "Сумма a и b = " + addition);
        System.out.println( "Разность a и b = " + subtraction);
        System.out.println( "Произведение a и b = " + multiplication);
        System.out.println( "Частное a и b = " + division);
        System.out.println( "Остаток от деления a и b = " + modulus);
    }
}
