package javaEssential.hw9.task3;


public class Main {
    public static void main(String[] args) {
        MyDictionary <String,Integer> dictionary = new MyDictionary<>(13);

        for (int i = 0; i < 20; i++) {
            dictionary.add("String#" + (i+1), i);
        }
        System.out.println(dictionary);
        System.out.println(dictionary.get(15));
    }
}
