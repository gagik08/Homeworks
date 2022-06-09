package javaEssential.hw6.task2;

public class Main {
    public static void main(String[] args){
        Animals pig = Animals.PIG;
        Animals wolf = Animals.WOLF;
        Animals elephant = Animals.ELEPHANT;
        Animals zebra = Animals.ZEBRA;
        Animals[] animals = {pig,wolf,elephant,zebra};
        for(Animals an : animals){
            System.out.println(an);
        }
    }
}
