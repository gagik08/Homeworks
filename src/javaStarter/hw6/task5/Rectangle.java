package javaStarter.hw6.task5;

public class Rectangle {
    public static void main(String[] args) {
        int rectangleLength = 15;
        int rectangleWidth = 4;
        System.out.println("-------------------");
        System.out.println("Rectangle: ");
        for (int i = 0; i < rectangleWidth; i++) {
            for (int j = 0; j < rectangleLength; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
