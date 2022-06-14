package javaAdvanced.hw2.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StopByEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <String> stringList = new ArrayList<>();
        System.out.println("Enter the values you want to add to the list: ");
        String addedValue;
        while (true){
            addedValue = sc.nextLine();
            if(addedValue.toLowerCase().equals("end")) break;
            else {
                stringList.add(addedValue);
                continue;
            }
        }

        if (stringList.size() == 1) System.out.println("List is empty");
        else {
            System.out.println("The list contains the following elements: ");
            for (String listElements : stringList) {
                System.out.println(listElements);
            }
        }
    }
}
