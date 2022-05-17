package javaStarter.hw5.task6;

public class DeMorganComparison {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean res1 = a|b;
        boolean res2 = !(!a & !b);

        System.out.println("Result of the original expression - " + res1);
        System.out.println("Result of equivalent expression - " + res2);
    }
}
