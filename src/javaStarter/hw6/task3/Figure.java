package javaStarter.hw6.task3;

public class Figure {
    public static void main(String[] args) {
        int rectangle = 3;
        System.out.println("-------------------");
        System.out.println("Rectangle: ");
        for (int i = 0; i < rectangle; i++) {
            for (int j = 0; j < rectangle*2; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        int rightTriangle = 7;
        System.out.println("-------------------");
        System.out.println("Right triangle: ");
        for (int i = 0; i < rightTriangle; i++) {
            for (int j = rightTriangle - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


        int equilateralTriangle = 7;
        System.out.println("-------------------");
        System.out.println("Equilateral triangle: ");
        for (int i = 1; i <= equilateralTriangle; i++) {
            for (int j = i; j <= equilateralTriangle; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


        int rhombusSide = 5;
        System.out.println("-------------------");
        System.out.println("Rhombus: ");
        for (int i2 = 1; i2 <= rhombusSide; i2++) {
            for (int j2 = i2; j2 <= rhombusSide; j2++) {
                System.out.print(" ");
            }
            for (int k2 = 1; k2 <= i2; k2++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i3=1; i3 <= rhombusSide; i3++) {
            for (int j3 = 1; j3 <= i3; j3++){
                System.out.print(" ");
            }
            for (int k3 = rhombusSide; k3 >= i3; k3--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
