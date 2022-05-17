package javaStarter.hw9.task5;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {5, 96, 15, 81, 714, 81, 6, 4, 8, -6};
        int[] newArray = new int[10];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length -1 - i];
            System.out.print(newArray[i] + " ");
        }
    }
}
