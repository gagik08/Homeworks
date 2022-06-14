package javaEssential.hw7.task5;

public class DivideByZeroException extends Exception{
    DivideByZeroException(){}

    @Override
    public String toString() {
        return "Divisor cannot be zero.\nTry again: ";
    }
}
