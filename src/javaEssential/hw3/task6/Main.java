package javaEssential.hw3.task6;

public class Main {
    public static void main(String[] args) {
        Printer simplePrinter = new Printer();
        Printer greenPrinter = new GreenPrinter();
        Printer redPrinter = new RedPrinter();
        Printer bluePrinter = new BluePrinter();
        simplePrinter.print("Test Color");
        greenPrinter.print("Test Color");
        redPrinter.print("Test Color");
        bluePrinter.print("Test Color");

        Printer printerDownCastToRed = (RedPrinter) redPrinter;
        printerDownCastToRed.print("DownCast To Red");
        Printer printerDownCastToGreen = (GreenPrinter) greenPrinter;
        printerDownCastToGreen.print("DownCast to Green");
        Printer printerDownCastToBlue = (BluePrinter) bluePrinter;
        printerDownCastToBlue.print("DownCast to Blue");

    }
}
