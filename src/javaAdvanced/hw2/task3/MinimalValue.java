package javaAdvanced.hw2.task3;

import java.util.LinkedList;
import java.util.Scanner;

public class MinimalValue {
    static Scanner scanner = new Scanner(System.in);
    static int getMinimum(LinkedList linkedList){
        int minimal = (int) linkedList.getFirst();
        for (int i = 0; i < linkedList.size(); i++){
            if ((int)linkedList.get(i) < minimal) minimal = (int)linkedList.get(i);
        }
        return minimal;
    }
    static void getIntegerList(int n, LinkedList linkedList){
        for (int i = 0; i < n; i++){
            System.out.print("Integer №" + (i+1) + ": ");
            linkedList.add(scanner.nextInt());
        }
    }

    public static void main(String[] args) {
        LinkedList <Integer> integers = new LinkedList<>();
        System.out.print("How many integers do you want to add to the list? - ");
        int integerCount = scanner.nextInt();
        getIntegerList(integerCount,integers);
        System.out.println("Minimal value = " + getMinimum(integers));
    }
}
