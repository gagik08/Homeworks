package javaEssential.hw9.task2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> integerList = new MyList<>(19);
        System.out.println(integerList);
        for (int i = 0; i < 19; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);


    }
}