package javaEssential.hw7.task2;

public class UnrealisticNumberException extends Throwable {
    UnrealisticNumberException() {
    }
    public String toString() {
        return ("You entered an unrealistic number. Try again/");
        }
    }
