package javaAdvanced.hw1.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(i+1);
        }

        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()){
            int addedElements = listIterator.next();
            System.out.print(addedElements + " ");
        }
    }
}
