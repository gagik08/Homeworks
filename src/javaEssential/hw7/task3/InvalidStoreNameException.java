package javaEssential.hw7.task3;

public class InvalidStoreNameException extends Exception{
    InvalidStoreNameException() {
    }
    public String toString() {
        return ("No store with this name found. Please try again/");
    }
}

