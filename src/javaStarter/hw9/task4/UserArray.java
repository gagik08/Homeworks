package javaStarter.hw9.task4;

import java.util.Arrays;

public class UserArray {
    static int[] myReverse (int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    static int [] subArray(int [] array, int index, int count){
        int[] newArray;
        int newIndex = 0;
        if (count <= array.length - index){
            newArray = new int[count];
            for (int i = index; i < count+index; i++) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
            return newArray;
        }
        else {
            newArray = new int[count];
            for (int i = index; i < count+index; i++) {
                if (i > array.length-1){
                    newArray[newIndex] = 1;
                }
                else {
                    newArray[newIndex] = array[i];
                }
                newIndex++;
            }
            return newArray;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,66,7,9,17,89,97,15};
        System.out.println("a");
        System.out.println("Inverted array: "+ Arrays.toString(myReverse(arr)));
        System.out.println("Desired range: " + Arrays.toString(subArray(arr,2,15)));
    }
}
