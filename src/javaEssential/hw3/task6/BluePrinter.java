package javaEssential.hw3.task6;

public class BluePrinter extends Printer{
    public final String ANSI_RESET = "\u001B[0m";
    public static final String BLUE_BRIGHT = "\033[0;94m";

    protected void print(String value){
        System.out.println(BLUE_BRIGHT+value+ANSI_RESET);
    }
}
