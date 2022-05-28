package javaEssential.hw3.task6;

public class RedPrinter extends Printer{
    public final String ANSI_RESET = "\u001B[0m";
    public static final String RED_BRIGHT = "\033[0;91m";

    protected void print(String value){
        System.out.println(RED_BRIGHT+value+ANSI_RESET);
    }
}
