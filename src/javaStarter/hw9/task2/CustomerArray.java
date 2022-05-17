package javaStarter.hw9.task2;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {
    Scanner sc = new Scanner(System.in);
    private int[] array;
    private int maxSize;

    public int[] arrayFilling (int maxSize){
        this.maxSize = maxSize;
        this.array = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            System.out.print("Value " + (i+1) + ": ");
            this.array[i] = sc.nextInt();
        }
        return this.array;
    }

    public int getMaxValue(){
        Arrays.sort(array);
        return array[maxSize-1];
    }

    public int getMinValue(){
        Arrays.sort(array);
        return array[0];
    }

    public int sumOfAllElements(){
        int sum = 0;
        for (int i = 0; i < maxSize; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double average(){
        return ((double)sumOfAllElements()/maxSize);
    }

    public void oddValues(){
        int count = 0;
        for (int i = 0; i < maxSize; i++) {
            if (array[i] % 2 == 1 || array[i] % 2 == -1 ) {
                System.out.print(array[i] + ", ");
                count++;
            }
        }
        if (count == 0) System.out.println("No odd numbers found");
    }
}

class Main{
    public static void main(String[] args) {
        CustomerArray customerArray = new CustomerArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array you want to create: ");
        customerArray.arrayFilling(sc.nextInt());
        System.out.println("The highest value of array you created is " + customerArray.getMaxValue());
        System.out.println("The smallest value of array you created is " + customerArray.getMinValue());
        System.out.println("The sum of all elements is " + customerArray.sumOfAllElements());
        System.out.println("Arithmetic mean of all given numbers - " + customerArray.average());
        System.out.print("Odd numbers in the array you created: "); customerArray.oddValues();
    }
}
