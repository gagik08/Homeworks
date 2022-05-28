package javaEssential.hw3.task6;

public class GreenPrinter extends Printer{
    public final String ANSI_RESET = "\u001B[0m";
    public static final String GREEN_BRIGHT = "\033[0;92m";

    protected void print(String value){
        System.out.println(GREEN_BRIGHT+value+ANSI_RESET);
    }
}
