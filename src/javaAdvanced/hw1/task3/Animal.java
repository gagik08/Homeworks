package javaAdvanced.hw1.task3;

public class Animal implements Comparable {
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object o) {
        int tmp = this.speed - ((Animal) o).speed;
        if (tmp != 0) return tmp;
        tmp = this.price - ((Animal) o).price;
        if (tmp != 0) return tmp;
        tmp = this.weight - ((Animal) o).weight;
        if (tmp != 0) return tmp;
        tmp = this.breed.compareTo(((Animal) o).breed);
        return tmp;
    }
}
